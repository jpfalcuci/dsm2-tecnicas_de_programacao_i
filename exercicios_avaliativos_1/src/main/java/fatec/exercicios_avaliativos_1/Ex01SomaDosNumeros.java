/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.exercicios_avaliativos_1;

/**
 *
 * @author jpfalcuci
 */

// 1. Faça um programa que imprima a soma dos números de 1 a 100.

public class Ex01SomaDosNumeros {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.print("A soma de todos os números compreendidos entre 1 e 100 é " + soma);
    }
}