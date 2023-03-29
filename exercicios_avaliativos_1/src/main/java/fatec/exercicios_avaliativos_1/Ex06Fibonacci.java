/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.exercicios_avaliativos_1;

import java.util.Scanner;

/**
 *
 * @author jpfalcuci
 */

// 6. Crie um programa que leia um número e imprima a sequência de Fibonacci até o número informado.

public class Ex06Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Fibonacci");
        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();
        int a = 1;
        int c = 0;
        
        if(numero > 0) {
            System.out.print("1, 1");
            for(int b = 1; b < numero; b = c) {
                c = a + b;
                System.out.printf(", %d", c);
                a = b;
            }
        } else {
            System.out.print("Número inválido");
        }
    }
}
