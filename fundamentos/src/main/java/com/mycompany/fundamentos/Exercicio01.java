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
public class Exercicio01 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int a, b, c, resultado;
        
        System.out.print("Digite o 1º dígito: ");
        a = input.nextInt();
        System.out.print("Digite o 2º dígito: ");
        b = input.nextInt();
        System.out.print("Digite o 3º dígito: ");
        c = input.nextInt();
        
        resultado = a * b * c;
        
        System.out.printf("O produto é %d%n", resultado);        
    }
}
