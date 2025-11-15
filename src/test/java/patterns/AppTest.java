package patterns;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import patterns.calcinterpreter.InterpreterEngine;

/**
 * Unit tests for Calculator Interpreter.
 */
public class AppTest extends TestCase {
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test basic addition
     */
    public void testBasicAddition() {
        int result = InterpreterEngine.evalWithInfixNotation("2 + 3");
        assertEquals(5, result);
    }

    /**
     * Test basic subtraction
     */
    public void testBasicSubtraction() {
        int result = InterpreterEngine.evalWithInfixNotation("10 - 4");
        assertEquals(6, result);
    }

    /**
     * Test basic multiplication
     */
    public void testBasicMultiplication() {
        int result = InterpreterEngine.evalWithInfixNotation("4 * 5");
        assertEquals(20, result);
    }

    /**
     * Test basic division
     */
    public void testBasicDivision() {
        int result = InterpreterEngine.evalWithInfixNotation("15 / 3");
        assertEquals(5, result);
    }

    /**
     * Test operator precedence (multiplication before addition)
     */
    public void testOperatorPrecedence() {
        int result = InterpreterEngine.evalWithInfixNotation("2 + 3 * 4");
        assertEquals(14, result); // 2 + (3 * 4) = 2 + 12 = 14
    }

    /**
     * Test parentheses
     */
    public void testParentheses() {
        int result = InterpreterEngine.evalWithInfixNotation("( 2 + 3 ) * 4");
        assertEquals(20, result); // (2 + 3) * 4 = 5 * 4 = 20
    }

    /**
     * Test nested parentheses
     */
    public void testNestedParentheses() {
        int result = InterpreterEngine.evalWithInfixNotation("2 * ( 5 * ( 3 + 6 ) ) / 15 - 2");
        assertEquals(4, result); // 2 * (5 * 9) / 15 - 2 = 2 * 45 / 15 - 2 = 90 / 15 - 2 = 6 - 2 = 4
    }

    /**
     * Test power operation
     */
    public void testPowerOperation() {
        int result = InterpreterEngine.evalWithInfixNotation("2 ^ 3");
        assertEquals(8, result); // 2^3 = 8
    }

    /**
     * Test complex expression with multiple operations
     */
    public void testComplexExpression() {
        int result = InterpreterEngine.evalWithInfixNotation("10 + 2 * 3 - 4 / 2");
        assertEquals(14, result); // 10 + 6 - 2 = 14
    }

    /**
     * Test expression with all operations
     */
    public void testAllOperations() {
        int result = InterpreterEngine.evalWithInfixNotation("( 2 + 3 ) * 4 - 10 / 2 + 2 ^ 2");
        assertEquals(19, result); // (5) * 4 - 5 + 4 = 20 - 5 + 4 = 19
    }
}
