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

// 4. Escreva um programa que leia um número e calcule o fatorial desse número.

public class Ex04Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Fatorial");
        System.out.print("Digite um número natural: ");
        int numero = input.nextInt();
        int fat = 1;
        
        if(numero < 0) {
            System.out.print("Não existe fatorial de número negativo");
        } else if(numero < 2) {
            System.out.printf("%d! = %d", numero, 1);
        } else {
            for(int i = 1; i <= numero; i++) {
                fat *= i;
            }
            System.out.printf("%d! = %d", numero, fat);
        }
    }
}
