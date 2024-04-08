package com.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  @Test
  @DisplayName("Test addition with valid input")
  public void testAddValidInput() {
    Scanner scanner = new Scanner("10\n5\n+\n"); // Simulasi input pengguna

    int expectedResult = 15;

    // Simulasikan pemanggilan metode yang diperlukan dalam App
    int operand1 = Validation.parseOperand(scanner.next());
    int operand2 = Validation.parseOperand(scanner.next());
    char operator = scanner.next().charAt(0);
    int result = Calculator.compute(operand1, operand2, operator);

    assertEquals(expectedResult, result);
  }

  // Tambahkan test case untuk operasi lain, kasus batas, dan validasi input

}
