package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAddition() {
        int operand1 = 1;
        int operand2 = 2;
        char operator = '+';
        int expectedResult = 3;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtraction() {
        int operand1 = 1;
        int operand2 = 2;
        char operator = '-';
        int expectedResult = -1;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }
}
