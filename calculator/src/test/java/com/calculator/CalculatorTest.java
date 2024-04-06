package com.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputCharacter() {
        Calculator calculator = new Calculator();
        calculator.compute('A', 10, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeOperand1() {
        Calculator calculator = new Calculator();
        calculator.compute(32768, 10, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeOperand2() {
        Calculator calculator = new Calculator();
        calculator.compute(10, 32768, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        Calculator calculator = new Calculator();
        calculator.compute(10, 5, '=');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.compute(10, 0, '/');
    }

    @Test
    public void testValidInput() {
        Calculator calculator = new Calculator();
        int result = calculator.compute(10, 5, '+');
        assertEquals(15, result);
    }
}

