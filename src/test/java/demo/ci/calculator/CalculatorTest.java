package demo.ci.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddUnity() {
        assertEquals(1, Calculator.add(1, 0));
    }

    @Test
    public void testAdd() {
        assertEquals(1 + Calculator.add(1, 0), Calculator.add(1, Calculator.add(1, 0)));
    }

}