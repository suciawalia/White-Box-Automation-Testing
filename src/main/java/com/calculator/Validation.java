package com.calculator;

public class Validation {
    public void validate(int operand1, int operand2, char operator) {        
        if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767) {
            throw new IllegalArgumentException("Angka yang dihitung harus berada dalam rentang -32,768 hingga 32,767");
        }
        
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Operator yang boleh diinputkan adalah +, -, *, atau /");
        }
        
        if (operator == '/' && operand2 == 0) {
            throw new IllegalArgumentException("Pada operasi pembagian, pembagi tidak boleh bernilai nol");
        }
    }

    public static int integerValidation(String input) {
        // Cek apakah input mengandung titik (untuk bilangan float)
        if (input.contains(".")) {
            throw new IllegalArgumentException("Nilai yang dihitung harus berupa bilangan bulat, tidak boleh berupa float.");
        }
        // Coba parsing input menjadi bilangan integer
        int result;
        try {
            result = Integer.parseInt(input);
            return result;
        } catch (NumberFormatException e) {            
            throw new IllegalArgumentException("Nilai yang dihitung harus angka, tidak boleh karakter.");
        }
    }
    
}