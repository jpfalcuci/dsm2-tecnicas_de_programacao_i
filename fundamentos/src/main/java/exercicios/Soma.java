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
public class Soma {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número");
        int numero1 = Integer.parseInt(num1);
        
        String num2 = JOptionPane.showInputDialog("Digite o segundo número");
        int numero2 = Integer.parseInt(num2);
        
        String resposta = String.format("A soma de %d + %d é igual a %d", numero1, numero2, numero1 + numero2);
        
        JOptionPane.showMessageDialog(null, resposta, "Adição", 1);
    }
}
