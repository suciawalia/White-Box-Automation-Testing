package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.DisplayName;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("TC2-01 Operasi penjumlahan dua bilangan")
    public void testAddition() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '+';
        int expectedResult = 33;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("TC2-02 Operasi pengurangan dua bilangan")
    public void testSubtraction() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '-';
        int expectedResult = -15;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("TC2-03 Operasi perkalian dua bilangan")
    public void testMultiplication() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '*';
        int expectedResult = 216;

        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("TC2-04 Operasi pembagian dua bilangan")
    public void testDivision() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '/';
        float expectedResult = 0.375f; 
        
        float result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result, 0.001f); 
    }

    @Test
    @DisplayName("TC2-05 Operasi dua bilangan dimana operator yang dimasukkan invalid (bukan berupa +, -, *, atau /)")
    public void testInvalidOperator() {
        Calculator calculator = new Calculator();
        try {
            calculator.compute(9, 24, '='); 
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Operator tidak valid: =", e.getMessage());
        }
    }

}

