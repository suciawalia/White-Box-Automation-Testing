package com.calculator;

public class Calculator {
    public static int compute(int operand1, int operand2, char operator) {
        Validation validation = new Validation();
        validation.validate(operand1, operand2, operator);
        
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operator tidak valid: " + operator);
        }
    }
}

