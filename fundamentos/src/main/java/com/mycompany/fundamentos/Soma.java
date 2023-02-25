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
public class Soma {
    public static void main(String[] args)
    {
        // Cria um scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        
        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt(); // Faz a leitura do input e armazena na variável
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("A soma é %d%n", sum);
    }
}
