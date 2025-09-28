package patterns.calcinterpreter.expr;

public class NumberExpr implements Expression {
    private int number;

    public NumberExpr(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
