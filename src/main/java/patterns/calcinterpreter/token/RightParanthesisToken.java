package patterns.calcinterpreter.token;

public class RightParanthesisToken extends ParanthesisToken {
    public RightParanthesisToken(String value) {
        super(value);
    }

    public static boolean isRightParanthesisToken(String str) {
        return ")".equals(str.trim());
    }
}
