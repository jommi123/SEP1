import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.calculate(Calculator.Operation.ADD, 2.0, 3.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.calculate(Calculator.Operation.SUBTRACT, 5.0, 3.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(15.0, calculator.calculate(Calculator.Operation.MULTIPLY, 5.0, 3.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.calculate(Calculator.Operation.DIVIDE, 6.0, 3.0));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () ->
                        calculator.calculate(Calculator.Operation.DIVIDE, 5.0, 0.0),
                "Cannot divide by zero");
    }

    @Test
    public void testUnsupportedOperation() {
        assertThrows(IllegalArgumentException.class, () ->
                        calculator.calculate(Calculator.Operation.EXPONENT, 2.0, 3.0),
                "Unsupported operation: EXPONENT");
    }
}