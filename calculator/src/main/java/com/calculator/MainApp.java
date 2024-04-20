package com.calculator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan operand pertama: ");
            int operand1 = Validation.parseOperand(scanner.next());
        
            System.out.print("Masukkan operand kedua: ");
            int operand2 = Validation.parseOperand(scanner.next());
            
            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
        
            Calculator calculator = new Calculator();
            int result = calculator.compute(operand1, operand2, operator);
            System.out.println("Hasil: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.exit(0);
        }
    }
}


