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

// 5. Crie um programa que leia um número e verifique se ele é um número perfeito
// (soma dos seus divisores é igual a ele mesmo).

public class Ex05NumeroPerfeito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Número perfeito");
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        int antecessores = 1;
        
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                antecessores += i;
            }
        }
        
        if(numero == antecessores) {
            System.out.printf("%d é um número perfeito.", numero);
        } else {
            System.out.printf("%d não é um número perfeito.", numero);
        }
    }
}
