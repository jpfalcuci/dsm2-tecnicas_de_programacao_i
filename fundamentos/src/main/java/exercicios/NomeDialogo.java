/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import javax.swing.JOptionPane;

/**
 *
 * @author jpfalcuci
 */
public class NomeDialogo {
    public static void main(String[] args) {
        // Pede para o usuário inserir o nome
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        
        // Cria mensagem
        String mensagem = String.format("Olá %s, bem vindo(a) ao Java", name);
        
        // Exibe a mensagem com o nome do uruário
        JOptionPane.showMessageDialog(null, mensagem, "Hip hip hooray", 1);
        
        // Exibe a mensagem passando a variável "name" diretamente
        JOptionPane.showMessageDialog(null, "Olá " + name + ", bem vindo(a) ao Java");
    }
}
