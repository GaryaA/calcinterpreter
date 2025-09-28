package patterns.calcinterpreter.token;

public abstract class ParanthesisToken extends OpToken {

    public ParanthesisToken(String value) {
        super(value);
    }

    public static boolean isParanthesisToken(String str) {
        str = str.trim();
        return switch (str) {
            case "(", ")" -> true;
            default -> false;
        };
    }
}
