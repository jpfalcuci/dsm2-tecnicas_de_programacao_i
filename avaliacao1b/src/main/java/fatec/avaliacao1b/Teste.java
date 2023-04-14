/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.avaliacao1b;

/**
 *
 * @author jpfalcuci
 */
public class Teste {
    public static void main(String[] args) {
        Double quilometro = 2.8;
        Double litro = 4.5;
        Double metroCubico = 2.5;
        Double barril = 3.0; 
        
        ConversaoDeDados.quilometroParaMetro(quilometro);
        ConversaoDeDados.litroParaDecilitro(litro);
        ConversaoDeDados.metroCubicoParaPeCubico(metroCubico);
        ConversaoDeDados.barrilParaDecalitro(barril);
        ConversaoDeDados.barrilParaLitro(barril); 
    }
}
