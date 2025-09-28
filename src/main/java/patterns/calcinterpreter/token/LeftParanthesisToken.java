package patterns.calcinterpreter.token;

public class LeftParanthesisToken extends ParanthesisToken {
    public LeftParanthesisToken(String value) {
        super(value);
    }

    public static boolean isLeftParanthesisToken(String str) {
        return "(".equals(str.trim());
    }
}
