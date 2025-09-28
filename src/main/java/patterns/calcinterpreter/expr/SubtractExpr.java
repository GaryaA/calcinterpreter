package patterns.calcinterpreter.expr;

public class SubtractExpr extends OperatorExpr {

    public SubtractExpr(Expression leftExpr, Expression rightExpr) {
        super(leftExpr, rightExpr);
    }

    @Override
    public int doInterpret(Expression leftExpr, Expression rightExpr) {
        return leftExpr.interpret() - rightExpr.interpret();
    }
}