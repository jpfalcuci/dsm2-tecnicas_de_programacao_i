/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author jpfalcuci
 */

// Usando o construtor de Conta2 para inicializar a variável "name" no momento em que cada objeto Conta2 é criado
public class TesteConta2 {

    public static void main(String[] args) {

        // Cria dois objetos Conta2
        Conta2 minhaConta1 = new Conta2("João");
        Conta2 minhaConta2 = new Conta2("Paulo");

        // Exibe os valores iniciais de "name" para as c
        System.out.printf("Os nomes dos objetos são: %s e %s",
                minhaConta1.getName(), minhaConta2.getName());
    }
}
