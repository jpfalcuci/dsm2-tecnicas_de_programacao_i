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

// 7. Escreva um programa que leia um número inteiro e verifique se ele é um número par ou ímpar.

public class Ex07ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Par ou ímpar");
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        
        if(numero == 0)
            System.out.printf("%d não é par nem ímpar.", numero);
        else if(numero%2 == 0)
            System.out.printf("%d é par.", numero);
        else
            System.out.printf("%d é ímpar.", numero);
    }
}
