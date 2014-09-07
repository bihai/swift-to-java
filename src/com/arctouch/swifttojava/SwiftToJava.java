package com.arctouch.swifttojava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
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
import swiftparser.SwiftParser.Assignment_operatorContext;
import swiftparser.SwiftParser.Binary_operatorContext;
import swiftparser.SwiftParser.Branch_statementContext;
import swiftparser.SwiftParser.Class_declarationContext;
import swiftparser.SwiftParser.Class_nameContext;
import swiftparser.SwiftParser.Constant_declarationContext;
import swiftparser.SwiftParser.DeclarationContext;
import swiftparser.SwiftParser.DeclarationsContext;
import swiftparser.SwiftParser.Element_nameContext;
import swiftparser.SwiftParser.Else_clauseContext;
import swiftparser.SwiftParser.ExpressionContext;
import swiftparser.SwiftParser.Expression_element_listContext;
import swiftparser.SwiftParser.For_statementContext;
import swiftparser.SwiftParser.Function_declarationContext;
import swiftparser.SwiftParser.Function_resultContext;
import swiftparser.SwiftParser.If_statementContext;
import swiftparser.SwiftParser.ParameterContext;
import swiftparser.SwiftParser.Parameter_clauseContext;
import swiftparser.SwiftParser.Parameter_clausesContext;
import swiftparser.SwiftParser.Parameter_listContext;
import swiftparser.SwiftParser.PatternContext;
import swiftparser.SwiftParser.Pattern_initializerContext;
import swiftparser.SwiftParser.Primary_expressionContext;
import swiftparser.SwiftParser.Return_statementContext;
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

import com.arctouch.swifttojava.SymbolTable.Kind;
import com.arctouch.swifttojava.SymbolTable.Scope;
import com.arctouch.swifttojava.SymbolTable.Symbol;
import com.arctouch.swifttojava.swift.ObjectMethodCall;
import com.arctouch.swifttojava.swift.SwiftAssignment;
import com.arctouch.swifttojava.swift.SwiftBinaryOp;
import com.arctouch.swifttojava.swift.SwiftCast;
import com.arctouch.swifttojava.swift.SwiftComplexData;
import com.arctouch.swifttojava.swift.SwiftConditional;
import com.arctouch.swifttojava.swift.SwiftConstructor;
import com.arctouch.swifttojava.swift.SwiftExpression;
import com.arctouch.swifttojava.swift.SwiftFor;
import com.arctouch.swifttojava.swift.SwiftFunction;
import com.arctouch.swifttojava.swift.SwiftFunction.SwiftParameter;
import com.arctouch.swifttojava.swift.SwiftFunction.SwiftReturn;
import com.arctouch.swifttojava.swift.SwiftIdentifier;
import com.arctouch.swifttojava.swift.SwiftLiteral;
import com.arctouch.swifttojava.swift.SwiftReturnStatement;
import com.arctouch.swifttojava.swift.SwiftSelfStatement;
import com.arctouch.swifttojava.swift.SwiftSuperCall;
import com.arctouch.swifttojava.swift.SwiftVariableDeclaration;

public class SwiftToJava {
	public static void main(final String[] args) throws IOException {
		String input = "resources/hattrick.swift";
		String output = "gen";
		if (args.length > 0) {
			input = args[0];
			if (args.length > 1) {
				output = args[1];
			}
		} else {
			// throw new IllegalArgumentException("You must give two paths!");
		}

		final InputStream is = new FileInputStream(new File(input));
		final CharStream cs = new ANTLRInputStream(is);
		final SwiftLexer lexer = new SwiftLexer(cs);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final SwiftParser parser = new SwiftParser(tokens);
		parser.addParseListener(new SwiftListener(output));
		parser.top_level();
	}
}

class SwiftListener extends SwiftBaseListener {
	private SymbolTable symbols = new SymbolTable();
	private String outputDir = "gen";

	public SwiftListener(String output) {
		outputDir = output;
	}

	@Override
	public void exitClass_name(final Class_nameContext ctx) {
		super.exitClass_name(ctx);
	}

	@Override
	public void exitClass_declaration(final Class_declarationContext ctx) {
		super.exitClass_declaration(ctx);

		SwiftComplexData klass = new SwiftComplexData();
		Symbol symbol = symbols.createSymbol(ctx.class_name().getText(),
				Kind.Klass, null, Scope.Global, null);
		klass.name = symbol.translate();
		System.out.println("Processing class:" + klass.name);

		final Type_inheritance_clauseContext inheritance_clause = ctx
				.type_inheritance_clause();
		if (inheritance_clause != null && !inheritance_clause.isEmpty()) {
			final List<Type_identifierContext> list = inheritance_clause
					.type_inheritance_list().type_identifier();

			if (!list.isEmpty()) {
				symbol = symbols.findSymbol(list.get(0).getText(), Kind.Klass);
				int i = 0;
				if (symbol != null) {
					klass.parent = list.get(0).getText();
					i = 1;
				}
				for (; i < list.size(); i++) {
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
		String result = st.render();

		File output = new File(outputDir + "/com/arctouch/generated/",
				klass.name + ".java");
		FileWriter out = null;
		try {
			output.getParentFile().mkdirs();
			out = new FileWriter(output);
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (out != null) {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

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
			} else {
				final Variable_declarationContext varDecl = declarations
						.declaration().variable_declaration();

				if (varDecl != null) {
					final SwiftExpression varClassDecl = parseDeclaration(declarations
							.declaration());
					if (varClassDecl != null) {
						klass.instanceState.add(varClassDecl);
					}
				} else {
					final Constant_declarationContext constDecl = declarations
							.declaration().constant_declaration();

					if (constDecl != null) {
						final SwiftExpression constClassDecl = parseDeclaration(declarations
								.declaration());
						if (constClassDecl != null) {
							klass.instanceState.add(constClassDecl);
						}
					}
				}
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
		if (!parameterList.isEmpty()) {
			function.parameters.add(parameterList);
		}
	}

	void parseStatement(ArrayList<SwiftExpression> statements,
			final StatementsContext statementsContext) {
		if (statementsContext == null) {
			return;
		}
		for (int i = 0; i < statementsContext.getChildCount(); i++) {
			StatementContext statementContext = statementsContext.statement(i);
			if (statementContext.declaration() != null) {
				SwiftExpression varDecl = parseDeclaration(statementContext
						.declaration());
				if (varDecl != null) {
					statements.add(varDecl);
				}
			} else if (statementContext.expression() != null) {
				SwiftExpression parseExpression = parseExpression(statementContext
						.expression());
				if (parseExpression != null) {
					statements.add(parseExpression);
				}
			} else if (statementContext.branch_statement() != null) {
				Branch_statementContext statement = statementContext
						.branch_statement();

				If_statementContext if_statement = statement.if_statement();
				SwiftExpression ifStatement = parseConditional(if_statement);
				if (ifStatement != null) {
					statements.add(ifStatement);
				}
			} else if (statementContext.loop_statement() != null) {
				if (statementContext.loop_statement().for_statement() != null) {
					For_statementContext statement = statementContext
							.loop_statement().for_statement();
					SwiftFor loop = new SwiftFor();
					loop.init = parseVariableDeclaration(statement.for_init()
							.variable_declaration());

					loop.condition = parseExpression(statement.expression(0));
					loop.increment = parseExpression(statement.expression(1));

					parseStatement(loop.statements, statement.code_block()
							.statements());
					statements.add(loop);
				}
			} else if (statementContext.loop_statement() != null) {
				if (statementContext.loop_statement().for_statement() != null) {
					For_statementContext statement = statementContext
							.loop_statement().for_statement();
					SwiftFor loop = new SwiftFor();
					loop.init = parseVariableDeclaration(statement.for_init()
							.variable_declaration());

					loop.condition = parseExpression(statement.expression(0));
					loop.increment = parseExpression(statement.expression(1));

					parseStatement(loop.statements, statement.code_block()
							.statements());
					statements.add(loop);
				}
			} else if (statementContext.control_transfer_statement() != null) {
				if (statementContext.control_transfer_statement().return_statement() != null) {
					Return_statementContext statement = statementContext.control_transfer_statement().return_statement();
					SwiftReturnStatement returnStatement = new SwiftReturnStatement();
					returnStatement.returnExpression = parseExpression(statement.expression());
					statements.add(returnStatement);
				}
			} else {
				System.out.println(statementContext.getText());
			}
		}
	}

	SwiftExpression parseConditional(If_statementContext if_statement) {
		if (if_statement == null) {
			return null;
		}

		SwiftConditional cond = new SwiftConditional();
		cond.condition = parseExpression(if_statement.if_condition()
				.expression());
		parseStatement(cond.ifTrue, if_statement.code_block().statements());
		Else_clauseContext else_clause = if_statement.else_clause();
		if (else_clause != null) {
			if (else_clause.if_statement() != null) {
				cond.ifNot.add(parseConditional(else_clause.if_statement()));
			} else {
				parseStatement(cond.ifNot, else_clause.code_block()
						.statements());
			}
		}
		return cond;
	}

	SwiftExpression parseDeclaration(final DeclarationContext declaration) {
		SwiftExpression varExp = parseVariableDeclaration(declaration
				.variable_declaration());
		if (varExp != null) {
			return varExp;
		}

		Constant_declarationContext consDecl = declaration
				.constant_declaration();
		if (consDecl != null) {
			SwiftVariableDeclaration var = new SwiftVariableDeclaration();
			var.mutable = false;
			Pattern_initializerContext initializerContext = consDecl
					.pattern_initializer_list().pattern_initializer(0);
			PatternContext pattern = initializerContext.pattern();

			Symbol symbol = symbols.createSymbol(pattern.identifier_pattern()
					.getText(), Kind.Variable, null, Scope.Funktion, null);

			var.name = symbol.translate();
			var.mutable = false;

			TypeContext typeContext = pattern.type_annotation().type();
			Symbol type = null;
			if (typeContext.type().isEmpty()) {
				type = symbols.findSymbol(typeContext.getText(), Kind.Klass);
			} else {
				type = symbols.findSymbol(typeContext.type(0).getText(), Kind.Klass);
			}
			var.type = type.translate();

			if (initializerContext.initializer() == null) {
				return var;
			}

			SwiftAssignment assignment = new SwiftAssignment();
			assignment.assignee = var;
			assignment.assignement = parseExpression(initializerContext
					.initializer().expression());
			return assignment;
		}
		return null;
	}

	private SwiftExpression parseVariableDeclaration(
			Variable_declarationContext varDecl) {
		if (varDecl == null) {
			return null;
		}
		SwiftVariableDeclaration var = new SwiftVariableDeclaration();
		var.mutable = false;
		Pattern_initializerContext initializerContext = varDecl
				.pattern_initializer_list().pattern_initializer(0);
		PatternContext pattern = initializerContext.pattern();

		Symbol symbol = symbols.createSymbol(pattern.identifier_pattern()
				.getText(), Kind.Variable, null, Scope.Funktion, null);

		var.name = symbol.translate();
		var.mutable = true;

		TypeContext typeContext = pattern.type_annotation().type();
		Symbol type = null;
		if (typeContext.type().isEmpty()) {
			type = symbols.findSymbol(typeContext.getText(), Kind.Klass);
		} else {
			type = symbols.findSymbol(typeContext.type(0).getText(), Kind.Klass);
		}

		var.type = type.translate();

		if (initializerContext.initializer() == null) {
			return var;
		}

		SwiftAssignment assignment = new SwiftAssignment();
		assignment.assignee = var;
		assignment.assignement = parseExpression(initializerContext
				.initializer().expression());
		return assignment;
	}

	SwiftExpression parseExpression(ExpressionContext expression) {
		Primary_expressionContext pexp = expression.primary_expression();
		if (pexp != null) {
			if (pexp.self_expression() != null) {
				return new SwiftSelfStatement();
			} else if (pexp.identifier() != null) {
				Symbol symbol = symbols.findSymbol(pexp.identifier().getText(), Kind.Variable);
				if (symbol != null) {
					return new SwiftIdentifier(symbol.translate());
				}
				symbol = symbols.findSymbol(pexp.identifier().getText(), Kind.Funktion);
				if (symbol != null) {
					return new SwiftIdentifier(symbol.translate());
				}
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
			Assignment_operatorContext assign = expression
					.assignment_operator();
			ExpressionContext leftExp = expression.expression(0);

			if (assign != null) {
				ExpressionContext rightExp = expression.expression(1);
				SwiftAssignment a = new SwiftAssignment();
				a.operator = expression.assignment_operator().getText();
				a.assignee = parseExpression(leftExp);
				a.assignement = parseExpression(rightExp);
				return a;
			}

			// Solving for methods/ functions
			if (expression.parenthesized_expression() != null) {
				SwiftExpression exp = parseExpression(leftExp);
				ArrayList<SwiftExpression> parameters;

				
				Symbol symbol = symbols.findSymbol(leftExp.getText(), Kind.Funktion);
				if (symbol != null && symbol.kind != Kind.Undefined) {
					ObjectMethodCall call = new ObjectMethodCall();
					call.call = exp;
					parameters = call.parameters;
					exp = call;
				} else {
					symbol = symbols.findSymbol(leftExp.getText(), Kind.Klass);
					if (symbol != null && symbol.kind != Kind.Undefined) {
						SwiftConstructor cons = new SwiftConstructor();
						cons.constructor = exp;
						parameters = cons.parameters;
						exp = cons;
					} else {
						ObjectMethodCall call = new ObjectMethodCall();
						call.call = exp;
						parameters = call.parameters;
						exp = call;
					}
				}
				parseArguments(parameters, expression
						.parenthesized_expression().expression_element_list());
				return exp;
			}
			if (expression.type_casting_operator() != null) {
				SwiftCast cast = new SwiftCast();
				cast.source = parseExpression(leftExp);
				Symbol symbol = symbols.findSymbol(expression
						.type_casting_operator().type().getText(), Kind.Type);
				cast.type = symbol.translate();
				return cast;
			}
			// Solving for binary exps
			Binary_operatorContext binary = expression.binary_operator();
			if (binary != null) {
				ExpressionContext rightExp = expression.expression(1);

				SwiftBinaryOp sum = new SwiftBinaryOp();
				sum.lvalue = parseExpression(leftExp);
				sum.rvalue = parseExpression(rightExp);
				sum.operator = binary.getText();
				return sum;
			}

			if (leftExp.primary_expression() != null) {
				SwiftExpression c = parseExpression(leftExp);
				return c;
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
