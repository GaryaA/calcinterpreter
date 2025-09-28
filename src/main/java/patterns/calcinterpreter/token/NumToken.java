package patterns.calcinterpreter.token;

public class NumToken extends Token {

    private Integer value;

    public NumToken(String s) {
        this.value = Integer.parseInt(s.trim());
    }

    public NumToken(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public static boolean isNumToken(String str) {
        try {
            Integer.parseInt(str.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
