package patterns.calcinterpreter.token;

public class AddToken extends OpToken {
    public AddToken(String value) {
        super(value);
        this.precedence = 2;
    }

    public static boolean isAddToken(String s) {
        return "+".equals(s.trim());
    }
}
