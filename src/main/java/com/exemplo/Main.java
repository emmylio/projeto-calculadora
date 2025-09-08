package com.exemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testando a divisão (código do Eric)
        System.out.println("10 / 2 = " + calc.dividir(10, 2));
        System.out.println("10 / 0 = " + calc.dividir(10, 0)); // caso especial
    }
}
