package patterns.calcinterpreter.expr;

public class AddExpr extends OperatorExpr {

    public AddExpr(Expression leftExpr, Expression rightExpr) {
        super(leftExpr, rightExpr);
    }

    @Override
    public int doInterpret(Expression leftExpr, Expression rightExpr) {
        return leftExpr.interpret() + rightExpr.interpret();
    }
}