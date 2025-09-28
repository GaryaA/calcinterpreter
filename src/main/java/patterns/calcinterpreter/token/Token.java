package patterns.calcinterpreter.token;

public abstract class Token {

    public abstract Object getValue();

    public static Token getToken(String s) {
        Token r = null;
        s = s.trim();
        if (NumToken.isNumToken(s)) {
            r = new NumToken(s);
        } else if (OpToken.isOpToken(s)) {
            if (AddToken.isAddToken(s)) {
                r = new AddToken(s);
            } else if (DivideToken.isDivideToken(s)) {
                r = new DivideToken(s);
            } else if (SubtractToken.isSubtractToken(s)) {
                r = new SubtractToken(s);
            } else if (MultiplyToken.isMultiplyToken(s)) {
                r = new MultiplyToken(s);
            } else if (PowToken.isPowToken(s)) {
                r = new PowToken(s);
            }
        } else if (ParanthesisToken.isParanthesisToken(s)) {
            if (LeftParanthesisToken.isLeftParanthesisToken(s)) {
                r = new LeftParanthesisToken(s);
            } else if (RightParanthesisToken.isRightParanthesisToken(s)) {
                r = new RightParanthesisToken(s);
            }
        }
        return r;
    }

}


