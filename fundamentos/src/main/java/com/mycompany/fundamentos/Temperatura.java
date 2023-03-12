/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

import java.util.Scanner;

/**
 *
 * @author jpfalcuci
 */
public class Temperatura {
    public static void main(String[] args) {
        
        double ferenheit;
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os graus Farenheit: ");
        ferenheit = input.nextDouble();
        
        double celsius = (ferenheit - AJUSTE) * FATOR;
        System.out.printf("%5.2f %s %5.2f %s", ferenheit, " graus Farenheit "
                + "é equivalente à ", celsius, "graus Celsius");
    }
}
