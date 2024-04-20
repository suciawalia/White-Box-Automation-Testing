package com.calculator;

import static org.junit.Assert.assertEquals; // Import assertEquals
import static org.junit.Assert.fail;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void testOperandRangeValidation() {
        try {
            Validation validation = new Validation();
            validation.validate(-32780, 100, '+');
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Angka yang dihitung harus berada dalam rentang -32,768 hingga 32,767";
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
