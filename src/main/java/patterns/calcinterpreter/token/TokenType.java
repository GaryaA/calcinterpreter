package patterns.calcinterpreter.token;

public enum TokenType {

    NUMBER("\\d+(\\.\\d+)?"),
    PLUS("\\+"),
    MINUS("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    POW("\\^"),
    LEFT_PARENTHESIS("\\("),
    RIGHT_PARENTHESIS("\\)");

    private String regex;

    TokenType(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
