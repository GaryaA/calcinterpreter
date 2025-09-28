package patterns.calcinterpreter.expr;

public class DivideExpr extends OperatorExpr {

    public DivideExpr(Expression leftExpr, Expression rightExpr) {
        super(leftExpr, rightExpr);
    }

    @Override
    public int doInterpret(Expression leftExpr, Expression rightExpr) {
        return leftExpr.interpret() / rightExpr.interpret();
    }
}