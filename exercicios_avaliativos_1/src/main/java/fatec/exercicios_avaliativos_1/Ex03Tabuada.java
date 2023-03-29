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

// 3. Crie um programa que leia um número e imprima a tabuada de multiplicação desse número de 1 a 10.

public class Ex03Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tabuada");
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", numero, i, numero * i);
        }
    }    
}
