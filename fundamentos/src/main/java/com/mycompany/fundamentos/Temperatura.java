/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jpfalcuci
 */
public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os graus Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.printf("%5.2f %s %5.2f %s", fahrenheit, " graus Fahrenheit "
                + "é equivalente à ", celsius, "graus Celsius");
    }
}
