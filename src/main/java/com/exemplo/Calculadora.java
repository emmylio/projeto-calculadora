package com.exemplo;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }

    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não permitida");
        }
        return Math.sqrt(a);
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }
}
