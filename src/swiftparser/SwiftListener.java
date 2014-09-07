// Generated from Swift.g4 by ANTLR 4.3
package swiftparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftParser}.
 */
public interface SwiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(@NotNull SwiftParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(@NotNull SwiftParser.Parenthesized_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(@NotNull SwiftParser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(@NotNull SwiftParser.Deinitializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull SwiftParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull SwiftParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void enterContext_sensitive_keyword(@NotNull SwiftParser.Context_sensitive_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void exitContext_sensitive_keyword(@NotNull SwiftParser.Context_sensitive_keywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(@NotNull SwiftParser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(@NotNull SwiftParser.Raw_value_style_enum_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(@NotNull SwiftParser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(@NotNull SwiftParser.Superclass_initializer_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(@NotNull SwiftParser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(@NotNull SwiftParser.Pattern_initializer_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(@NotNull SwiftParser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(@NotNull SwiftParser.Protocol_initializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_clause(@NotNull SwiftParser.Precedence_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_clause(@NotNull SwiftParser.Precedence_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(@NotNull SwiftParser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(@NotNull SwiftParser.Variable_declaration_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(@NotNull SwiftParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(@NotNull SwiftParser.Label_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(@NotNull SwiftParser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(@NotNull SwiftParser.Getter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(@NotNull SwiftParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(@NotNull SwiftParser.Operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_clause(@NotNull SwiftParser.Requirement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_clause(@NotNull SwiftParser.Requirement_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(@NotNull SwiftParser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(@NotNull SwiftParser.Import_pathContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull SwiftParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull SwiftParser.Class_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(@NotNull SwiftParser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(@NotNull SwiftParser.WillSet_didSet_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(@NotNull SwiftParser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(@NotNull SwiftParser.Raw_value_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(@NotNull SwiftParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(@NotNull SwiftParser.Identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(@NotNull SwiftParser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(@NotNull SwiftParser.Balanced_tokensContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(@NotNull SwiftParser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(@NotNull SwiftParser.Extension_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(@NotNull SwiftParser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(@NotNull SwiftParser.Protocol_associated_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(@NotNull SwiftParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(@NotNull SwiftParser.Variable_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(@NotNull SwiftParser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(@NotNull SwiftParser.Protocol_property_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(@NotNull SwiftParser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(@NotNull SwiftParser.Fallthrough_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull SwiftParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull SwiftParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(@NotNull SwiftParser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(@NotNull SwiftParser.Import_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(@NotNull SwiftParser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(@NotNull SwiftParser.Union_style_enumContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull SwiftParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull SwiftParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(@NotNull SwiftParser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(@NotNull SwiftParser.Local_parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(@NotNull SwiftParser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(@NotNull SwiftParser.Protocol_subscript_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(@NotNull SwiftParser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(@NotNull SwiftParser.Raw_value_style_enumContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(@NotNull SwiftParser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(@NotNull SwiftParser.In_out_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity_clause(@NotNull SwiftParser.Associativity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity_clause(@NotNull SwiftParser.Associativity_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(@NotNull SwiftParser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(@NotNull SwiftParser.Generic_parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(@NotNull SwiftParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(@NotNull SwiftParser.Declaration_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(@NotNull SwiftParser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(@NotNull SwiftParser.Typealias_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(@NotNull SwiftParser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(@NotNull SwiftParser.Subscript_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(@NotNull SwiftParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(@NotNull SwiftParser.Type_annotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(@NotNull SwiftParser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(@NotNull SwiftParser.Default_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIs_pattern(@NotNull SwiftParser.Is_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIs_pattern(@NotNull SwiftParser.Is_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(@NotNull SwiftParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(@NotNull SwiftParser.Class_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_body(@NotNull SwiftParser.Tuple_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_body(@NotNull SwiftParser.Tuple_type_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull SwiftParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull SwiftParser.Function_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_attributes(@NotNull SwiftParser.Infix_operator_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_attributes(@NotNull SwiftParser.Infix_operator_attributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(@NotNull SwiftParser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(@NotNull SwiftParser.Raw_value_style_enum_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(@NotNull SwiftParser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(@NotNull SwiftParser.Initializer_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(@NotNull SwiftParser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(@NotNull SwiftParser.Default_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(@NotNull SwiftParser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(@NotNull SwiftParser.Top_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull SwiftParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull SwiftParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(@NotNull SwiftParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(@NotNull SwiftParser.Attribute_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(@NotNull SwiftParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(@NotNull SwiftParser.While_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(@NotNull SwiftParser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(@NotNull SwiftParser.Type_inheritance_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(@NotNull SwiftParser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(@NotNull SwiftParser.Tuple_pattern_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(@NotNull SwiftParser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(@NotNull SwiftParser.Protocol_member_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_level(@NotNull SwiftParser.Precedence_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_level(@NotNull SwiftParser.Precedence_levelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull SwiftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull SwiftParser.PatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element_list(@NotNull SwiftParser.Expression_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element_list(@NotNull SwiftParser.Expression_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_expression(@NotNull SwiftParser.Superclass_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_expression(@NotNull SwiftParser.Superclass_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(@NotNull SwiftParser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(@NotNull SwiftParser.Superclass_method_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declarations(@NotNull SwiftParser.Protocol_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declarations(@NotNull SwiftParser.Protocol_member_declarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(@NotNull SwiftParser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(@NotNull SwiftParser.Setter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(@NotNull SwiftParser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(@NotNull SwiftParser.WillSet_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(@NotNull SwiftParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(@NotNull SwiftParser.Protocol_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SwiftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SwiftParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element(@NotNull SwiftParser.Expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element(@NotNull SwiftParser.Expression_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(@NotNull SwiftParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(@NotNull SwiftParser.Type_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(@NotNull SwiftParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(@NotNull SwiftParser.Literal_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(@NotNull SwiftParser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(@NotNull SwiftParser.Prefix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(@NotNull SwiftParser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(@NotNull SwiftParser.Element_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(@NotNull SwiftParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(@NotNull SwiftParser.Constant_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(@NotNull SwiftParser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(@NotNull SwiftParser.Initializer_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(@NotNull SwiftParser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(@NotNull SwiftParser.Enum_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(@NotNull SwiftParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(@NotNull SwiftParser.If_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull SwiftParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull SwiftParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull SwiftParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull SwiftParser.Parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void enterAs_pattern(@NotNull SwiftParser.As_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 */
	void exitAs_pattern(@NotNull SwiftParser.As_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(@NotNull SwiftParser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(@NotNull SwiftParser.Wildcard_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(@NotNull SwiftParser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(@NotNull SwiftParser.Union_style_enum_case_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull SwiftParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull SwiftParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(@NotNull SwiftParser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(@NotNull SwiftParser.Enum_case_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_pattern(@NotNull SwiftParser.Type_casting_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_pattern(@NotNull SwiftParser.Type_casting_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(@NotNull SwiftParser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(@NotNull SwiftParser.Extension_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(@NotNull SwiftParser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(@NotNull SwiftParser.Import_path_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(@NotNull SwiftParser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(@NotNull SwiftParser.Union_style_enum_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(@NotNull SwiftParser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(@NotNull SwiftParser.AssociativityContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 */
	void enterGuard_expression(@NotNull SwiftParser.Guard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 */
	void exitGuard_expression(@NotNull SwiftParser.Guard_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(@NotNull SwiftParser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(@NotNull SwiftParser.Union_style_enum_membersContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(@NotNull SwiftParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(@NotNull SwiftParser.Integer_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(@NotNull SwiftParser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(@NotNull SwiftParser.Dictionary_literal_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull SwiftParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull SwiftParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(@NotNull SwiftParser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(@NotNull SwiftParser.Protocol_composition_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(@NotNull SwiftParser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(@NotNull SwiftParser.Raw_value_style_enum_case_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull SwiftParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull SwiftParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(@NotNull SwiftParser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(@NotNull SwiftParser.Tuple_pattern_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(@NotNull SwiftParser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(@NotNull SwiftParser.Struct_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(@NotNull SwiftParser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(@NotNull SwiftParser.Protocol_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull SwiftParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull SwiftParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(@NotNull SwiftParser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(@NotNull SwiftParser.Type_inheritance_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(@NotNull SwiftParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(@NotNull SwiftParser.Protocol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(@NotNull SwiftParser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(@NotNull SwiftParser.Setter_keyword_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(@NotNull SwiftParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(@NotNull SwiftParser.For_in_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(@NotNull SwiftParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(@NotNull SwiftParser.Case_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(@NotNull SwiftParser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(@NotNull SwiftParser.Generic_parameter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(@NotNull SwiftParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(@NotNull SwiftParser.RequirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(@NotNull SwiftParser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(@NotNull SwiftParser.Identifier_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(@NotNull SwiftParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(@NotNull SwiftParser.Array_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(@NotNull SwiftParser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(@NotNull SwiftParser.Value_binding_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(@NotNull SwiftParser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(@NotNull SwiftParser.Array_literal_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(@NotNull SwiftParser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(@NotNull SwiftParser.Generic_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull SwiftParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull SwiftParser.Do_while_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(@NotNull SwiftParser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(@NotNull SwiftParser.Dictionary_literal_itemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull SwiftParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull SwiftParser.AttributesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(@NotNull SwiftParser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(@NotNull SwiftParser.Generic_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(@NotNull SwiftParser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(@NotNull SwiftParser.Attribute_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(@NotNull SwiftParser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(@NotNull SwiftParser.Generic_argument_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(@NotNull SwiftParser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(@NotNull SwiftParser.Getter_keyword_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(@NotNull SwiftParser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(@NotNull SwiftParser.Conformance_requirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(@NotNull SwiftParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(@NotNull SwiftParser.Labeled_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(@NotNull SwiftParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(@NotNull SwiftParser.Enum_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(@NotNull SwiftParser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(@NotNull SwiftParser.Implicit_member_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(@NotNull SwiftParser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(@NotNull SwiftParser.Enum_case_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(@NotNull SwiftParser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(@NotNull SwiftParser.Declaration_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(@NotNull SwiftParser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(@NotNull SwiftParser.Requirement_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(@NotNull SwiftParser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(@NotNull SwiftParser.Subscript_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull SwiftParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull SwiftParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(@NotNull SwiftParser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(@NotNull SwiftParser.Setter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(@NotNull SwiftParser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(@NotNull SwiftParser.Import_kindContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(@NotNull SwiftParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(@NotNull SwiftParser.Struct_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(@NotNull SwiftParser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(@NotNull SwiftParser.Case_item_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(@NotNull SwiftParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(@NotNull SwiftParser.Branch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(@NotNull SwiftParser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(@NotNull SwiftParser.Type_casting_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closure(@NotNull SwiftParser.Trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closure(@NotNull SwiftParser.Trailing_closureContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(@NotNull SwiftParser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(@NotNull SwiftParser.Postfix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(@NotNull SwiftParser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(@NotNull SwiftParser.Typealias_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(@NotNull SwiftParser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(@NotNull SwiftParser.Typealias_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(@NotNull SwiftParser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(@NotNull SwiftParser.Generic_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(@NotNull SwiftParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(@NotNull SwiftParser.Tuple_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(@NotNull SwiftParser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(@NotNull SwiftParser.Superclass_subscript_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(@NotNull SwiftParser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(@NotNull SwiftParser.Union_style_enum_memberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(@NotNull SwiftParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(@NotNull SwiftParser.Function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull SwiftParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull SwiftParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(@NotNull SwiftParser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(@NotNull SwiftParser.Raw_value_style_enum_case_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull SwiftParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull SwiftParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull SwiftParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull SwiftParser.Variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 */
	void enterMetatype_type(@NotNull SwiftParser.Metatype_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 */
	void exitMetatype_type(@NotNull SwiftParser.Metatype_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expression(@NotNull SwiftParser.Self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expression(@NotNull SwiftParser.Self_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(@NotNull SwiftParser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(@NotNull SwiftParser.Control_transfer_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(@NotNull SwiftParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(@NotNull SwiftParser.Binary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull SwiftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull SwiftParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clauses(@NotNull SwiftParser.Parameter_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clauses(@NotNull SwiftParser.Parameter_clausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(@NotNull SwiftParser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(@NotNull SwiftParser.Getter_setter_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(@NotNull SwiftParser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(@NotNull SwiftParser.Array_literal_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(@NotNull SwiftParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(@NotNull SwiftParser.Continue_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(@NotNull SwiftParser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(@NotNull SwiftParser.Same_type_requirementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(@NotNull SwiftParser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(@NotNull SwiftParser.Protocol_method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(@NotNull SwiftParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(@NotNull SwiftParser.Break_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull SwiftParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull SwiftParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(@NotNull SwiftParser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(@NotNull SwiftParser.Closure_signatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(@NotNull SwiftParser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(@NotNull SwiftParser.Expression_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull SwiftParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull SwiftParser.InitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(@NotNull SwiftParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(@NotNull SwiftParser.Code_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SwiftParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SwiftParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(@NotNull SwiftParser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(@NotNull SwiftParser.Statement_labelContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(@NotNull SwiftParser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(@NotNull SwiftParser.Tuple_type_element_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(@NotNull SwiftParser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(@NotNull SwiftParser.Dictionary_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(@NotNull SwiftParser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(@NotNull SwiftParser.Getter_setter_keyword_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(@NotNull SwiftParser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(@NotNull SwiftParser.Tuple_patternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(@NotNull SwiftParser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(@NotNull SwiftParser.Balanced_tokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(@NotNull SwiftParser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(@NotNull SwiftParser.Postfix_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(@NotNull SwiftParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(@NotNull SwiftParser.Switch_caseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 */
	void enterGuard_clause(@NotNull SwiftParser.Guard_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 */
	void exitGuard_clause(@NotNull SwiftParser.Guard_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier(@NotNull SwiftParser.Protocol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier(@NotNull SwiftParser.Protocol_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(@NotNull SwiftParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(@NotNull SwiftParser.Else_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SwiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SwiftParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(@NotNull SwiftParser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(@NotNull SwiftParser.Tuple_type_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(@NotNull SwiftParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(@NotNull SwiftParser.For_initContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(@NotNull SwiftParser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(@NotNull SwiftParser.Parameter_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(@NotNull SwiftParser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(@NotNull SwiftParser.Initializer_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(@NotNull SwiftParser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(@NotNull SwiftParser.Union_style_enum_case_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(@NotNull SwiftParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(@NotNull SwiftParser.Prefix_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull SwiftParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull SwiftParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(@NotNull SwiftParser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(@NotNull SwiftParser.Pattern_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(@NotNull SwiftParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(@NotNull SwiftParser.Struct_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull SwiftParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull SwiftParser.Loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(@NotNull SwiftParser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(@NotNull SwiftParser.Infix_operator_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull SwiftParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull SwiftParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull SwiftParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull SwiftParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(@NotNull SwiftParser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(@NotNull SwiftParser.Switch_casesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(@NotNull SwiftParser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(@NotNull SwiftParser.DidSet_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(@NotNull SwiftParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(@NotNull SwiftParser.Function_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull SwiftParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull SwiftParser.Switch_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier_list(@NotNull SwiftParser.Protocol_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier_list(@NotNull SwiftParser.Protocol_identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull SwiftParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull SwiftParser.DeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_head(@NotNull SwiftParser.Typealias_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_head(@NotNull SwiftParser.Typealias_headContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(@NotNull SwiftParser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(@NotNull SwiftParser.Capture_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull SwiftParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull SwiftParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(@NotNull SwiftParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(@NotNull SwiftParser.Closure_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(@NotNull SwiftParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(@NotNull SwiftParser.Conditional_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(@NotNull SwiftParser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(@NotNull SwiftParser.Capture_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(@NotNull SwiftParser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(@NotNull SwiftParser.Wildcard_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(@NotNull SwiftParser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(@NotNull SwiftParser.Raw_value_style_enum_membersContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(@NotNull SwiftParser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(@NotNull SwiftParser.Function_resultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(@NotNull SwiftParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(@NotNull SwiftParser.Function_signatureContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(@NotNull SwiftParser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(@NotNull SwiftParser.Subscript_resultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull SwiftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull SwiftParser.LiteralContext ctx);
}