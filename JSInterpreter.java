import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

// Visitor principal
class EvalVisitor extends jsBaseVisitor<Object> {
    Map<String, java.util.function.Function<List<Object>, Object>> builtins = new HashMap<>();
    Map<String, Object> memory = new HashMap<>();

    // ==========================
    // PROGRAMA
    // ==========================
    @Override
    public Object visitPrograma(jsParser.ProgramaContext ctx) {
        for (var stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    // ==========================
    // VARIÁVEIS
    // ==========================
    @Override
    public Object visitVariableDeclaration(jsParser.VariableDeclarationContext ctx) {
        String id = ctx.ID().getText();
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
        }

        memory.put(id, value);
        return value;
    }

    // ==========================
    // EXPRESSÕES
    // ==========================
    @Override
    public Object visitExpression(jsParser.ExpressionContext ctx) {
        return visit(ctx.assignmentExpression());
    }

    @Override
    public Object visitAssignmentExpression(jsParser.AssignmentExpressionContext ctx) {
        if (ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("=")) {
            String id = ctx.leftHandSideExpression().getText();
            Object value = visit(ctx.assignmentExpression());
            memory.put(id, value);
            return value;
        }
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Object visitPrimaryExpression(jsParser.PrimaryExpressionContext ctx) {
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (memory.containsKey(id)) {
                return memory.get(id);
            }

            // NÃO crashar para funções
            if (builtins.containsKey(id)) {
                return id; // deixa passar para callExpression
            }

            throw new RuntimeException("Variável não definida: " + id);
        }

        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }

        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        return null;
    }

    // ==========================
    // LITERAIS
    // ==========================
    @Override
    public Object visitLiteral(jsParser.LiteralContext ctx) {
        if (ctx.NUMBER() != null) {
            return Double.parseDouble(ctx.NUMBER().getText());
        }
        if (ctx.STRING() != null) {
            String s = ctx.STRING().getText();
            return s.substring(1, s.length() - 1);
        }
        if (ctx.BOOLEAN() != null) {
            return Boolean.parseBoolean(ctx.BOOLEAN().getText());
        }
        if (ctx.getText().equals("null")) return null;

        return null;
    }

    // ==========================
    // OPERAÇÕES
    // ==========================
    @Override
    public Object visitAdditiveExpression(jsParser.AdditiveExpressionContext ctx) {
        Object left = visit(ctx.multiplicativeExpression(0));

        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object right = visit(ctx.multiplicativeExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("+")) {
                left = ((Number) left).doubleValue() + ((Number) right).doubleValue();
            } else {
                left = ((Number) left).doubleValue() - ((Number) right).doubleValue();
            }
        }

        return left;
    }

    @Override
    public Object visitMultiplicativeExpression(jsParser.MultiplicativeExpressionContext ctx) {
        Object left = visit(ctx.unaryExpression(0));

        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            Object right = visit(ctx.unaryExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("*")) {
                left = ((Number) left).doubleValue() * ((Number) right).doubleValue();
            } else if (op.equals("/")) {
                left = ((Number) left).doubleValue() / ((Number) right).doubleValue();
            } else {
                left = ((Number) left).doubleValue() % ((Number) right).doubleValue();
            }
        }

        return left;
    }
    public EvalVisitor() {
        builtins.put("print", args -> {
            for (Object a : args) {
                System.out.println(a);
            }
            return null;
        });
    }
    // ==========================
    // PRINT (função especial)
    // ==========================
    @Override
    public Object visitCallExpression(jsParser.CallExpressionContext ctx) {

        String funcName = ctx.getParent().getText();

        // remover argumentos do nome (hack simples mas funciona)
        funcName = funcName.replaceAll("\\(.*\\)", "");

        List<Object> args = new ArrayList<>();

        if (ctx.argumentList() != null) {
            for (var arg : ctx.argumentList().assignmentExpression()) {
                args.add(visit(arg));
            }
        }

        // BUILT-IN
        if (builtins.containsKey(funcName)) {
            return builtins.get(funcName).apply(args);
        }

        throw new RuntimeException("Função não definida: " + funcName);
        }   
    }

// ==========================
// MAIN
// ==========================
public class JSInterpreter {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Uso: java JSInterpreter <ficheiro.js>");
            return;
        }

        String code = new String(Files.readAllBytes(Paths.get(args[0])));

        CharStream input = CharStreams.fromString(code);
        jsLexer lexer = new jsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        jsParser parser = new jsParser(tokens);

        ParseTree tree = parser.programa();

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
