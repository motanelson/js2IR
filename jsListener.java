// Generated from js.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsParser}.
 */
public interface jsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(jsParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(jsParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(jsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(jsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(jsParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(jsParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(jsParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(jsParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(jsParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(jsParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(jsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(jsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(jsParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(jsParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(jsParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(jsParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(jsParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(jsParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(jsParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(jsParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(jsParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(jsParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(jsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(jsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(jsParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(jsParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(jsParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(jsParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(jsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(jsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(jsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(jsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(jsParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(jsParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(jsParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(jsParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(jsParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(jsParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(jsParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(jsParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(jsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(jsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(jsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(jsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(jsParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(jsParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(jsParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(jsParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideExpression(jsParser.LeftHandSideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideExpression(jsParser.LeftHandSideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(jsParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(jsParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(jsParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(jsParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(jsParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(jsParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(jsParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(jsParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(jsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(jsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(jsParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(jsParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(jsParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(jsParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(jsParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(jsParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(jsParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(jsParser.ParameterListContext ctx);
}