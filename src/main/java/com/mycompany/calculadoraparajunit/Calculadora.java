/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraparajunit;

/**
 *
 * @author ED2023
 */
public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int result = num1 + num2;
        return result;
    }

    public int resta() {
        int result = num1 - num2;
        return result;
    }

    public int multiplica() {
        int result = num1 * num2;
        return result;
    }

    public int divide() {
        if (num2 == 0) {
            throw new java.lang.ArithmeticException("División por 0");
        } else {
            int result = num1 / num2;
            return result;
        }
    }
}
