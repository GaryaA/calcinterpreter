package patterns.calcinterpreter.expr;

public class MultiplyExpr extends OperatorExpr {


    public MultiplyExpr(Expression leftExpr, Expression rightExpr) {
        super(leftExpr, rightExpr);
    }

    @Override
    public int doInterpret(Expression leftExpr, Expression rightExpr) {
        return leftExpr.interpret() * rightExpr.interpret();
    }
}