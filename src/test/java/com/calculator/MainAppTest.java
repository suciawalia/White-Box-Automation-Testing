package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.InputStream;
import java.io.PrintStream;

public class MainAppTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private final ByteArrayOutputStream testOut = new ByteArrayOutputStream();

    @Before
    public void setUpInputOutput() {
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("TC1-01 Input dua buah operand, memilih operator, dan menampilkan hasilnya ke layar")
    public void testInputTwoOperandsAndAnOperation() {

        String input = "1\n2\n+\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil: 3\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-02 Input operand pertama bukan bilangan bulat (data float)")
    public void testInputOperand1AsFloat() {

        String input = "4.5\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Error: Nilai yang dihitung harus berupa bilangan bulat, tidak boleh berupa float.\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-03 Input operand pertama bukan bilangan bulat (karakter)")
    public void testInputOperand1AsChar() {

        String input = "a\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Error: Nilai yang dihitung harus angka, tidak boleh karakter.\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-04 Input operand kedua bukan bilangan bulat (data float)")
    public void testInputOperand2AsFloat() {

        String input = "8\n1.4\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Error: Nilai yang dihitung harus berupa bilangan bulat, tidak boleh berupa float.\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-05 Input operand kedua bukan bilangan bulat (karakter)")
    public void testInputOperand2AsChar() {

        String input = "2\nr\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Error: Nilai yang dihitung harus angka, tidak boleh karakter.\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-06 Input operator tidak valid")
    public void testInputInvalidOperator() {

        String input = "3\n5\n&\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Operator yang boleh diinputkan adalah +, -, *, atau /\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-07 Input operand tidak valid (diluar range -32,768 hingga 32,767)")
    public void testInputOperandOutOfRange() {

        String input = "4\n-32779\n-\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Angka yang dihitung harus berada dalam rentang -32,768 hingga 32,767\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("TC1-08 Input operand tidak valid (hasil operasi tidak terdefinisi)")
    public void testUndefinedResult() {

        String input = "10\n0\n/\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Expected output based on input values
        String expectedOutput = "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Pada operasi pembagian, pembagi tidak boleh bernilai nol\n";

        // Capture the console output
        MainApp.main(new String[]{});
        String actualOutput = testOut.toString().replaceAll("\r\n", "\n");

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

}