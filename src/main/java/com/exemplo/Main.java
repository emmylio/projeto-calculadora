package com.exemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(2, 3));
        System.out.println("Subtração: " + calc.subtrair(10, 4));
        System.out.println("Multiplicação: " + calc.multiplicar(4, 2));
        System.out.println("Divisão: " + calc.dividir(10, 2));
    }
}
