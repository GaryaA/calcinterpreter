package patterns.calcinterpreter;

public class InterpreterPatternDemo {

    public static void main(String[] args) {
        String inputExpression = "2 * ( 5 * ( 3 + 6 ) ) / 15 - 2";
        System.out.println("Evaluating Expression: " + inputExpression);

        System.out.println("answer: " + InterpreterEngine.evalWithInfixNotation(inputExpression));
    }

}
