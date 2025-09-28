package patterns.calcinterpreter.token;

public class SubtractToken extends OpToken {
    public SubtractToken(String value) {
        super(value);
        this.precedence = 2;
    }

    public static boolean isSubtractToken(String s) {
        return "-".equals(s.trim());
    }
}
