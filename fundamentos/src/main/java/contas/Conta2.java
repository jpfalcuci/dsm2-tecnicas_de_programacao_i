/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author jpfalcuci
 */

// A classe conta com um construtor que inicializa o "name"
public class Conta2 {

    private String name;

    // O construtor inicializa o "name" com nome no parâmetro
    public Conta2(String name) { // O nome do construtor é o nome da classe
        this.name = name;
    }

    // Método para configurar/inserir o nome
    public void setName(String name) {
        this.name = name;
    }

    // Método para recuperar o nome
    public String getName() {
        return name;
    }    
}
