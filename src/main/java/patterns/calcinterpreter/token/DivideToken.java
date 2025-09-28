package patterns.calcinterpreter.token;

public class DivideToken extends OpToken {
    public DivideToken(String value) {
        super(value);
        this.precedence = 3;
    }

    public static boolean isDivideToken(String s) {
        return "/".equals(s.trim());
    }
}
