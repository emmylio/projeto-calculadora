package com.exemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Demonstração de operações ===");

        System.out.println("10 + 5 = " + calc.somar(10, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("10 * 5 = " + calc.multiplicar(10, 5));
        System.out.println("10 ^ 2 = " + calc.potencia(10, 2));

        try {
            System.out.println("10 / 2 = " + calc.dividir(10, 2));
            System.out.println("10 / 0 = " + calc.dividir(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }

        try {
            System.out.println("√25 = " + calc.raizQuadrada(25));
            System.out.println("√-4 = " + calc.raizQuadrada(-4));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }
    }
}
