/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;
import java.util.Scanner;

/**
 *
 * @author jpfalcuci
 */

// Cria e manipula um objeto Conta1
public class TesteConta1 {
    public static void main(String[] args) {
        // cria um objeto Scanner para obter entrada a partir da janela de comandos
        Scanner input = new Scanner(System.in);
        
        // cria um objeto Conta1 e atribuir a minha conta
        Conta1 minhaConta = new Conta1();
        
        // exibe o valor inicial do nome (null)
        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());
        
        // solicita e lê o nome
        System.out.print("Por favor, entre com o nome: ");
        String name = input.nextLine(); // lê uma linha de texto
        minhaConta.setName(name); // insere "name" em minhaConta
        
        System.out.println(); // gera saída de uma linha em branco
        
        // exibe o nome armazenado no objeto minhaConta
        System.out.printf("O nome do objeto em minhaConta é: %s%n", minhaConta.getName());
    }
}
