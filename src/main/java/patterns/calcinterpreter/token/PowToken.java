package patterns.calcinterpreter.token;

public class PowToken extends OpToken {
    public PowToken(String value) {
        super(value);
        this.precedence = 4;
        this.leftAssociativity = false;
    }

    public static boolean isPowToken(String s) {
        return "^".equals(s.trim());
    }
}
