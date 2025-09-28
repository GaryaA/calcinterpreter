package patterns.calcinterpreter.expr;

public abstract class OperatorExpr implements Expression {

    private Expression leftExpr;
    private Expression rightExpr;

    public OperatorExpr(Expression leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public int interpret() {
        return doInterpret(leftExpr, rightExpr);
    }

    public abstract int doInterpret(Expression leftExpr, Expression rightExpr);

}
