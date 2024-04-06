package com.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputCharacter() {
        Validation validation = new Validation();
        validation.validate('A', 10, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeOperand1() {
        Validation validation = new Validation();
        validation.validate(32768, 10, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeOperand2() {
        Validation validation = new Validation();
        validation.validate(10, 32768, '+');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        Validation validation = new Validation();
        validation.validate(10, 5, '=');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Validation validation = new Validation();
        validation.validate(10, 0, '/');
    }

    @Test
    public void testValidInput() {
        Validation validation = new Validation();
        // Input yang valid
        validation.validate(10, 5, '+');
        // Tidak melemparkan pengecualian berarti validasi berhasil
    }
}
