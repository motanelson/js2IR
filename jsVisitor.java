// Generated from js.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jsParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(jsParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(jsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(jsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(jsParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(jsParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(jsParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(jsParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(jsParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(jsParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(jsParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(jsParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(jsParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(jsParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(jsParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(jsParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(jsParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(jsParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(jsParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(jsParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(jsParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(jsParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(jsParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(jsParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(jsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(jsParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(jsParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideExpression(jsParser.LeftHandSideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(jsParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(jsParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(jsParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(jsParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(jsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(jsParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(jsParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(jsParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(jsParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(jsParser.ParameterListContext ctx);
}