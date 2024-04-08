/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadoraparajunit;

/**
 *
 * @author ED2023
 */
public class CalculadoraParaJUnit {

    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora(15, 2);
        int miRes = miCalculadora.suma();
        System.out.println("Suma: " + miRes);
        miRes = miCalculadora.resta();
        System.out.println("Resta: " + miRes);
        miRes = miCalculadora.multiplica();
        System.out.println("Multiplicación: " + miRes);
        try {
            miRes = miCalculadora.divide();
            System.out.println("División: " + miRes);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
