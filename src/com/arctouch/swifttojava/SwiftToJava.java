package com.arctouch.swifttojava;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import swiftparser.SwiftBaseListener;
import swiftparser.SwiftLexer;
import swiftparser.SwiftParser;
import swiftparser.SwiftParser.Binary_operatorContext;
import swiftparser.SwiftParser.Class_declarationContext;
import swiftparser.SwiftParser.Class_nameContext;
import swiftparser.SwiftParser.DeclarationContext;
import swiftparser.SwiftParser.DeclarationsContext;
import swiftparser.SwiftParser.Element_nameContext;
import swiftparser.SwiftParser.ExpressionContext;
import swiftparser.SwiftParser.Expression_element_listContext;
import swiftparser.SwiftParser.Function_declarationContext;
import swiftparser.SwiftParser.Function_resultContext;
import swiftparser.SwiftParser.ParameterContext;
import swiftparser.SwiftParser.Parameter_clauseContext;
import swiftparser.SwiftParser.Parameter_clausesContext;
import swiftparser.SwiftParser.Parameter_listContext;
import swiftparser.SwiftParser.Parenthesized_expressionContext;
import swiftparser.SwiftParser.PatternContext;
import swiftparser.SwiftParser.Pattern_initializerContext;
import swiftparser.SwiftParser.Primary_expressionContext;
import swiftparser.SwiftParser.StatementContext;
import swiftparser.SwiftParser.StatementsContext;
import swiftparser.SwiftParser.Superclass_method_expressionContext;
import swiftparser.SwiftParser.Tuple_typeContext;
import swiftparser.SwiftParser.Tuple_type_elementContext;
import swiftparser.SwiftParser.Tuple_type_element_listContext;
import swiftparser.SwiftParser.TypeContext;
import swiftparser.SwiftParser.Type_identifierContext;
import swiftparser.SwiftParser.Type_inheritance_clauseContext;
import swiftparser.SwiftParser.Variable_declarationContext;

import com.arctouch.swifttojava.swift.ObjectMethodCall;
import com.arctouch.swifttojava.swift.SwiftAssignment;
import com.arctouch.swifttojava.swift.SwiftComplexData;
import com.arctouch.swifttojava.swift.SwiftConstructor;
import com.arctouch.swifttojava.swift.SwiftExpression;
import com.arctouch.swifttojava.swift.SwiftFunction;
import com.arctouch.swifttojava.swift.SwiftFunction.SwiftParameter;
import com.arctouch.swifttojava.swift.SwiftFunction.SwiftReturn;
import com.arctouch.swifttojava.swift.SwiftIdentifier;
import com.arctouch.swifttojava.swift.SwiftLiteral;
import com.arctouch.swifttojava.swift.SwiftSelfStatement;
import com.arctouch.swifttojava.swift.SwiftSuperCall;
import com.arctouch.swifttojava.swift.SwiftVariableDeclaration;

public class SwiftToJava {
	public static void main(final String[] args) throws IOException {
		// Reading the DSL script
		final InputStream is = ClassLoader
				.getSystemResourceAsStream("resources/hattrick.swift");

		// Loading the DSL script into the ANTLR stream.
		final CharStream cs = new ANTLRInputStream(is);

		// Passing the input to the lexer to create tokens
		final SwiftLexer lexer = new SwiftLexer(cs);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Passing the tokens to the parser to create the parse trea.
		final SwiftParser parser = new SwiftParser(tokens);

		// Adding the listener to facilitate walking through parse tree.
		parser.addParseListener(new SwiftListener());

		// invoking the parser.
		parser.top_level();
	}
}

class SwiftListener extends SwiftBaseListener {
	@Override
	public void exitClass_name(final Class_nameContext ctx) {
		super.exitClass_name(ctx);
	}

	@Override
	public void exitClass_declaration(final Class_declarationContext ctx) {
		super.exitClass_declaration(ctx);

		SwiftComplexData klass = new SwiftComplexData();
		klass.name = ctx.class_name().getText();

		final Type_inheritance_clauseContext inheritance_clause = ctx
				.type_inheritance_clause();
		if (!inheritance_clause.isEmpty()) {
			final List<Type_identifierContext> list = inheritance_clause
					.type_inheritance_list().type_identifier();

			if (!list.isEmpty()) {
				klass.parent = list.get(0).getText();
				for (int i = 1; i < list.size(); i++) {
					final Type_identifierContext type_identifierContext = list
							.get(i);
					String superClass = type_identifierContext.getText();
					klass.protocols.add(superClass);
				}
			}
		}

		final DeclarationsContext declarations = ctx.class_body()
				.declarations();
		getClassBodyDeclarations(klass, declarations);

		STGroup group = new STGroupFile("template/class.stg");
		ST st = group.getInstanceOf("class");
		st.add("class", klass);
		st.inspect();
		String result = st.render();
		System.out.println(result);
	}

	void getClassBodyDeclarations(SwiftComplexData klass,
			final DeclarationsContext root) {
		DeclarationsContext declarations = root;
		while (declarations != null) {
			// TODO check for function, attribute, class, instance that kind of
			// stuff
			final Function_declarationContext function_declaration = declarations
					.declaration().function_declaration();
			if (function_declaration != null) {
				final SwiftFunction swiftFunction = parseFunction(function_declaration);
				klass.instanceFunctions.add(swiftFunction);
			}
			declarations = declarations.declarations();
		}
	}

	SwiftFunction parseFunction(final Function_declarationContext root) {
		final String functionName = root.function_name().getText();
		final SwiftFunction swiftFunction = new SwiftFunction(functionName);
		final Function_resultContext function_result = root
				.function_signature().function_result();
		parseFunctionReturn(swiftFunction, function_result);
		final Parameter_clausesContext parameter_clauses = root
				.function_signature().parameter_clauses();
		parseFunctionClausesList(swiftFunction, parameter_clauses);

		parseStatement(swiftFunction.statements, root.function_body()
				.code_block().statements());

		return swiftFunction;
	}

	void parseFunctionReturn(final SwiftFunction swiftFunction,
			final Function_resultContext root) {
		final SwiftReturn ret = new SwiftReturn();
		if (root == null) {
			ret.noReturn = true;
			swiftFunction.functionReturn = ret;
			return;
		}
		final TypeContext type = root.type();
		ret.tuple = type.tuple_type() != null;
		if (ret.tuple) {
			parseTuple(ret, type.tuple_type());
		} else {
			ret.types.add(type.getText());
		}
		swiftFunction.functionReturn = ret;

	}

	void parseTuple(final SwiftReturn ret, final Tuple_typeContext root) {
		Tuple_type_element_listContext tupleElements = root.tuple_type_body()
				.tuple_type_element_list();

		while (tupleElements != null) {
			final Tuple_type_elementContext element = tupleElements
					.tuple_type_element();
			final Element_nameContext element_name = element.element_name();
			String name = null;
			String type;
			if (element_name != null) {
				name = element_name.getText();
				type = element.type_annotation().type().getText();
			} else {
				type = element.type().getText();
			}
			ret.types.add(type);
			ret.names.add(name);

			tupleElements = tupleElements.tuple_type_element_list();
		}
	}

	void parseFunctionClausesList(final SwiftFunction function,
			final Parameter_clausesContext root) {
		Parameter_clausesContext clauses = root;
		while (clauses != null) {
			parseFunctionParameters(function, clauses.parameter_clause());
			clauses = clauses.parameter_clauses();
		}

		function.curried = function.parameters.size() > 1;
	}

	void parseFunctionParameters(final SwiftFunction function,
			final Parameter_clauseContext root) {
		Parameter_listContext list = root.parameter_list();
		final ArrayList<SwiftParameter> parameterList = new ArrayList<SwiftParameter>();
		while (list != null) {
			final ParameterContext pContext = list.parameter();
			final SwiftParameter parameter = new SwiftParameter();
			parameter.name = pContext.parameter_name().getText();
			parameter.type = pContext.type_annotation().type().getText();
			parameterList.add(parameter);
			list = list.parameter_list();
		}
		function.parameters.add(parameterList);
	}

	void parseStatement(ArrayList<SwiftExpression> statements,
			final StatementsContext statementsContext) {
		for (int i = 0; i < statementsContext.getChildCount(); i++) {
			StatementContext statementContext = statementsContext.statement(i);
			if (statementContext.declaration() != null) {
				parseDeclaration(statements, statementContext.declaration());
			} else if (statementContext.expression() != null) {
				SwiftExpression parseExpression = parseExpression(statementContext
						.expression());
				if (parseExpression != null)
					statements.add(parseExpression);
			} else {
				throw new RuntimeException();
			}
		}
	}

	void parseDeclaration(ArrayList<SwiftExpression> statements,
			final DeclarationContext declaration) {
		Variable_declarationContext varDecl = declaration
				.variable_declaration();
		if (varDecl != null) {
			SwiftVariableDeclaration var = new SwiftVariableDeclaration();
			var.mutable = false;
			Pattern_initializerContext initializerContext = varDecl
					.pattern_initializer_list().pattern_initializer(0);
			PatternContext pattern = initializerContext.pattern();
			var.name = pattern.identifier_pattern().getText();
			var.type = pattern.type_annotation().type().getText();
			statements.add(var);
		}
	}

	SwiftExpression parseExpression(ExpressionContext expression) {
		Primary_expressionContext pexp = expression.primary_expression();
		if (pexp != null) {
			if (pexp.self_expression() != null) {
				return new SwiftSelfStatement();
			} else if (pexp.identifier() != null) {
				return new SwiftIdentifier(pexp.identifier().getText());
			} else if (pexp.literal_expression() != null) {
				return new SwiftLiteral(pexp.literal_expression().getText());
			} else if (pexp.superclass_expression() != null) {
				Superclass_method_expressionContext supMetExp = pexp
						.superclass_expression().superclass_method_expression();
				if (supMetExp != null) {
					SwiftSuperCall c = new SwiftSuperCall();

					c.methodName = supMetExp.identifier().getText();
					return c;
				}
			}
		} else {
			ExpressionContext leftExp = expression.expression(0);
			if (leftExp.primary_expression() != null) {
				SwiftExpression c = parseExpression(leftExp);
				if (c instanceof SwiftSuperCall) {
					Parenthesized_expressionContext parens = expression
							.parenthesized_expression();
					parseArguments(((SwiftSuperCall) c).parameters,
							parens.expression_element_list());
				}
				return c;
			} else {
				Binary_operatorContext binary = leftExp.binary_operator();
				if (binary != null) {
					if (binary.operator().getText().equals(".")) {
						ObjectMethodCall call = new ObjectMethodCall();
						call.object = parseExpression(leftExp.expression(0));
						call.methodName = parseExpression(leftExp.expression(1));
						parseArguments(call.parameters, expression
								.parenthesized_expression()
								.expression_element_list());
						return call;
					} else if (binary.operator().getText().equals("=")) {
						SwiftAssignment a = new SwiftAssignment();
						a.assignee = parseExpression(leftExp.expression(0));
						if (Character.isUpperCase(leftExp.expression(1)
								.getText().charAt(0))) {
							SwiftConstructor con = new SwiftConstructor();
							con.constructor = parseExpression(leftExp.expression(1));
							parseArguments(con.parameters, expression
									.parenthesized_expression()
									.expression_element_list());
							a.assignement = con;
						} else {
							a.assignement = parseExpression(leftExp
									.expression(1));
						}
						return a;
					}
				}
			}
		}
		System.out.println("Can't understand: " + expression.getText());
		return null;
	}

	void parseArguments(ArrayList<SwiftExpression> acc,
			Expression_element_listContext parens) {
		Expression_element_listContext current = parens;
		while (current != null) {
			acc.add(parseExpression(current.expression_element().expression()));

			current = current.expression_element_list();
		}
	}
}
