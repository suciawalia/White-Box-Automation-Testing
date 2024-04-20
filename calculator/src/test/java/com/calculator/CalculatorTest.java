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
        int operand1 = 9;
        int operand2 = 24;
        char operator = '+';
        int expectedResult = 33;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtraction() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '-';
        int expectedResult = -15;
        
        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplication() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '*';
        int expectedResult = 216;

        int result = calculator.compute(operand1, operand2, operator);
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDivision() {
        int operand1 = 9;
        int operand2 = 24;
        char operator = '/';
        float expectedResult = 0.375f; // Mengubah tipe data menjadi float
        
        float result = calculator.compute(operand1, operand2, operator); // Mengubah tipe data menjadi float
        
        assertEquals(expectedResult, result, 0.001f); // Menggunakan delta 0.001 untuk toleransi kesalahan
    }

}

