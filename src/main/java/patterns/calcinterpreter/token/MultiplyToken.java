package patterns.calcinterpreter.token;

public class MultiplyToken extends OpToken {


    public MultiplyToken(String value) {
        super(value);
        this.precedence = 3;
    }

    public static boolean isMultiplyToken(String s) {
        return "*".equals(s.trim());
    }
}
