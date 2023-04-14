/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.avaliacao1b;

/**
 *
 * @author jpfalcuci
 */
public class ConversaoDeDados {

    public static void quilometroParaMetro(Double num) {
        System.out.printf("%.2f quilometros correspondem a %.2f metros.%n", 
                num, num * 1000);
    }
    
    public static void litroParaDecilitro(Double num) {
        System.out.printf("%.2f litros correspondem a %.2f decilitros.%n", 
                num, num * 10);
    }
    
    public static void metroCubicoParaPeCubico(Double num) {
        System.out.printf("%.2f metros cúbicos correspondem a %.2f pés cúbicos.%n", 
                num, num * 35.31);
    }
    
    public static void barrilParaDecalitro(Double num) {
        System.out.printf("%.2f barris correspondem a %.2f decalitros.%n", 
                num, num * 16.36);
    }
    
    public static void barrilParaLitro(Double num) {
        System.out.printf("%.2f barris correspondem a %.2f litros.%n", 
                num, num * 163.65);
    }
}
