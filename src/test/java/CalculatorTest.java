import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void adding() {
        double expected = 30;
        double result = Calculator.adding(20, 10);
        assertEquals(expected, result);
    }

    @Test
    void subtracting() {
        double expected = 10;
        double result = Calculator.subtracting(20, 10);
        assertEquals(expected, result);
    }

    @Test
    void multiplying() {
        double expected = 200;
        double result = Calculator.multiplying(20, 10);
        assertEquals(expected, result);
    }

    @Test
    void dividing() {
        double expected = 2;
        double result = Calculator.dividing(20, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        boolean wasException = false;
        try {
            calculator.add("err", "");
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }
}