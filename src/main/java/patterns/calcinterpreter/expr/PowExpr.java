package patterns.calcinterpreter.expr;

public class PowExpr extends OperatorExpr {

    public PowExpr(Expression leftExpr, Expression rightExpr) {
        super(leftExpr, rightExpr);
    }

    @Override
    public int doInterpret(Expression leftExpr, Expression rightExpr) {
        return (int) Math.pow(leftExpr.interpret(), rightExpr.interpret());
    }
}