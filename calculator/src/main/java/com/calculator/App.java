package com.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan operand pertama: ");
        int operand1 = getOperand(scanner);
        
        System.out.print("Masukkan operand kedua: ");
        int operand2 = getOperand(scanner);
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        Calculator calculator = new Calculator();
        try {
            int result = calculator.compute(operand1, operand2, operator);
            System.out.println("Hasil: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    private static int getOperand(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                return Validation.parseOperand(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Masukkan kembali: ");
            }
        }
    }
}
