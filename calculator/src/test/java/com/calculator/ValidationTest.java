package com.calculator;

import static org.junit.Assert.assertEquals; // Import assertEquals
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ValidationTest {

    @Test
    @DisplayName("TC3-01 Validasi angka yang diinputkan berupa float yaitu 4,5")
    public void testFloatInputValidation() {
        try {
            Validation.integerValidation("4.5");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Nilai yang dihitung harus berupa bilangan bulat, tidak boleh berupa float.";
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    @DisplayName("TC3-02 Validasi nilai yang diinputkan berupa char yaitu 's")
    public void testInvalidInputValidation() {
        String input = "s";
        try {
            Validation.integerValidation(input);
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Nilai yang dihitung harus angka, tidak boleh karakter.";
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    @DisplayName("TC4-01 Validasi angka positif yang diinputkan berada diluar rentang -32768 hingga 32767")
    public void testOperand1OutOfRange() {
        Validation validation = new Validation();
        int operand1 = 32770;
        int operand2 = 5;
        char operator = '+';
        try {
            validation.validate(operand1, operand2, operator);
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Angka yang dihitung harus berada dalam rentang -32,768 hingga 32,767";
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    @DisplayName("TC4-02 Validasi angka negatif yang diinputkan berada diluar rentang -32768 hingga 32767")
    public void testOperand1OutOfRangeMin() {
        Validation validation = new Validation();
        int operand1 = -32770;
        int operand2 = 5;
        char operator = '*';
        try {
            validation.validate(operand1, operand2, operator);
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Angka yang dihitung harus berada dalam rentang -32,768 hingga 32,767";
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    @DisplayName("TC4-03 Validasi operator yang diinputkan selain '+', '-', '*', / yaitu 'x'")
    public void testInvalidOperator() {
        Validation validation = new Validation();
        int operand1 = 10;
        int operand2 = 2;
        char operator = 'x';
        try {
            validation.validate(operand1, operand2, operator);
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Operator yang boleh diinputkan adalah +, -, *, atau /";
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    @DisplayName("TC4-04 Validasi operand2 yang diinputkan adalah 0 ketika input operator pembagi(/)")
    public void testDivisionByZero() {
        Validation validation = new Validation();
        int operand1 = 10;
        int operand2 = 0; 
        char operator = '/';

        try {
            validation.validate(operand1, operand2, operator);
            fail("Expected IllegalArgumentException was not thrown"); // Menandai pengujian sebagai gagal jika pengecualian tidak dilemparkan
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Pada operasi pembagian, pembagi tidak boleh bernilai nol";
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
