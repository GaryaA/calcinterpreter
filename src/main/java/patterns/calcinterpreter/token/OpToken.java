package patterns.calcinterpreter.token;

public abstract class OpToken extends Token {

    protected String value;
    protected int precedence;
    protected boolean leftAssociativity = true;

    public OpToken(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static boolean isOpToken(String str) {
        str = str.trim();
        return switch (str) {
            case "+", "-", "*", "/", "^" -> true;
            default -> false;
        };
    }

    public int getPrecedence() {
        return precedence;
    }

    public boolean isLeftAssociativity() {
        return leftAssociativity;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
