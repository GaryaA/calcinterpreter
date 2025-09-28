package patterns.calcinterpreter;

import patterns.calcinterpreter.expr.*;
import patterns.calcinterpreter.token.*;

import java.util.Stack;

public class InterpreterEngine {

    public static int evalWithInfixNotation(String exprStr) {
        Stack<Token> outputStack = new Stack<>();
        Stack<Token> stack = new Stack<>();

        String[] tokens = exprStr.split(" ");
        for (String strToken : tokens) {
            Token token = Token.getToken(strToken);
            switch (token) {
                case NumToken numToken -> {
                    outputStack.push(numToken);
                }
                case LeftParanthesisToken leftPToken -> {
                    stack.push(leftPToken);
                }
                case RightParanthesisToken rightPToken -> {
                    while (!(stack.peek() instanceof LeftParanthesisToken)) {
                        evalTopExpr(outputStack, stack);
                    }
                    stack.pop();
                }
                case OpToken opToken -> {
                    Token t2;
                    OpToken opToken2;
                    while (
                            !stack.isEmpty() && ((t2 = stack.peek()) instanceof OpToken) &&
                                    !((opToken2 = (OpToken) t2) instanceof LeftParanthesisToken) && (
                                    opToken2.getPrecedence() > opToken.getPrecedence()
                                            || opToken.getPrecedence() == opToken2.getPrecedence() && opToken.isLeftAssociativity()
                            )) {
                        evalTopExpr(outputStack, stack);
                    }
                    stack.push(opToken);
                }
                default -> {
                }
            }
        }
        while (!stack.isEmpty()) {
            evalTopExpr(outputStack, stack);
        }
        return ((NumToken) outputStack.pop()).getValue();
    }

    private static void evalTopExpr(Stack<Token> outputStack, Stack<Token> stack) {
        NumToken val2 = (NumToken) outputStack.pop();
        NumToken val1 = (NumToken) outputStack.pop();
        OpToken op = (OpToken) stack.pop();
        outputStack.push(evalExpr(val1, val2, op));
    }

    private static NumToken evalExpr(NumToken val1, NumToken val2, OpToken op) {
        NumberExpr num1Expr = new NumberExpr(val1.getValue());
        NumberExpr num2Expr = new NumberExpr(val2.getValue());

        Expression expr = switch (op) {
            case AddToken _ -> new AddExpr(num1Expr, num2Expr);
            case SubtractToken _ -> new SubtractExpr(num1Expr, num2Expr);
            case MultiplyToken _ -> new MultiplyExpr(num1Expr, num2Expr);
            case DivideToken _ -> new DivideExpr(num1Expr, num2Expr);
            case PowToken _ -> new PowExpr(num1Expr, num2Expr);
            default -> null;
        };
        return new NumToken(expr.interpret());
    }

}