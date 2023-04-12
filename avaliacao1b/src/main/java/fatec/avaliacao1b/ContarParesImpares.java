/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.avaliacao1b;

/**
 *
 * @author jpfalcuci
 */
public class ContarParesImpares {
    public static void main(String[] args) {

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int pares = 0;
        int impares = 0;
        
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.printf("Quantidade de números pares: %d%n"
                + "Quantidade de números ímpares: %d", pares, impares);
    }
}
