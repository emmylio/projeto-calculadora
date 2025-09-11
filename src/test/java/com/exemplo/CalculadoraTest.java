package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testRaizQuadrada() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.raizQuadrada(25), 0.001);
    }

    @Test
    public void testPotencia() {
        Calculadora calc = new Calculadora();
        assertEquals(8.0, calc.potencia(2, 3), 0.001);
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
        assertEquals("Divisão por zero não permitida", exception.getMessage());
    }
}
