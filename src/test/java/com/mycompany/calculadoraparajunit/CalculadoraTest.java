/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadoraparajunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author ED2023
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @ParameterizedTest
    @CsvSource({"20,30,50", "14,10,24"})
    public void testSuma(int num1, int num2, int expResult) {
        System.out.println("suma de " + num1 + " y " + num2);
        Calculadora instance = new Calculadora(num1, num2);
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @ParameterizedTest
    @CsvSource({"40,30,10", "4,10,-6"})
    public void testResta(int num1, int num2, int expResult) {
        System.out.println("resta de " + num1 + " y " + num2);
        Calculadora instance = new Calculadora(num1, num2);
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @ParameterizedTest
    @CsvSource({"40,30,1200", "4,10,40"})
    public void testMultiplica(int num1, int num2, int expResult) {
        System.out.println("multiplicación de " + num1 + " y " + num2);
        Calculadora instance = new Calculadora(num1, num2);
        int result = instance.multiplica();
        assertEquals(expResult, result);

    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(120, 5);
        int expResult = 24;
        int result = instance.divide();
        assertEquals(expResult, result);

    }

    @Test
    public void testDivide0tyc() throws Exception {
        System.out.println("divide por 0 con try y catch");
        Calculadora instance = new Calculadora(120, 0);
        try {
            int result = instance.divide();
            fail("Debería haberse producido la excepción de división por 0");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "División por 0");
        }
    }

    @Test
    public void testDivideoof() throws Exception {
        System.out.println("divide por 0 otra forma");
        Calculadora instance = new Calculadora(120, 0);
        Exception exception = assertThrows(ArithmeticException.class, () -> instance.divide());
        assertEquals(exception.getMessage(), "División por 0");
    }

    @ParameterizedTest
    @CsvSource({"-5,0,0,'División por 0'", "20,10,2,''", "50,10,5,''"})
    void testDivideTodoEnUno(int n1, int n2, int expResult, String expectedMessage) throws Exception {
        System.out.println("división de " + n1 + " y " + n2);
        Calculadora instance = new Calculadora(n1, n2);
        if (n2 == 0) {
            Exception exception = assertThrows(ArithmeticException.class, () -> instance.divide());
            assertEquals(exception.getMessage(), "División por 0");
        } else {
            int result = instance.divide();
            assertEquals(expResult, result);
        }
    }
}
