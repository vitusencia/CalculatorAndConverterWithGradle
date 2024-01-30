import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

//    @Before
//    public void setUp() {
//        calculator = new Calculator();
//    }

    @Test
    void adding() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.adding(20, 10), 0.001);
    }

    @Test
    void subtracting() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.subtracting(20, 10), 0.001);
    }

    @Test
    void multiplying() {
        Calculator calculator = new Calculator();
        assertEquals(200, calculator.multiplying(20, 10), 0.001);
    }

    @Test
    void dividing() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.dividing(20, 10), 0.001);
    }

    @Test
    void whenInputIncorrectValueThenThrowException() {
        boolean wasException = false;
        try {
            calculator.add("err", "");
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }
}