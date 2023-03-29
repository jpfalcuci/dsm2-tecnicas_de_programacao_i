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

// 2. Escreva um programa que leia um número e imprima todos os números primos menores ou iguais ao número informado.

public class Ex02Primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Números primos");
        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = input.nextInt();
        
        if(numero < 2) {
            System.out.print("Número inválido");
        } else  {
            for(int i = 2; i <= numero; i++) {
                if (i == 2 || i == 3) {
                    System.out.printf("%d%s", i, " ");
                } else if (i % 2 == 0 || i % 3 == 0) {
                    continue; // não é primo
                } else {
                    boolean primo = true;
                    for(int j = 3; j < i; j++) {
                        if (i % j == 0) {
                            primo = false;
                            continue;
                        }
                    }
                    if(primo) {
                        System.out.printf("%d%s", i, " ");
                    }
                }
            }
        }
    }
}
