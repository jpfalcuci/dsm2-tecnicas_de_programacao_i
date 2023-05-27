package test;

import implement.Colaborador;
import implement.Parceiro;

public class Teste {
    public static void main(String[] args) {
        Colaborador colab = new Colaborador();
        Parceiro parca = new Parceiro();

        colab.setNome("João");
        System.out.println(colab.getNome());

        parca.setDesempenho(10.0);
        System.out.println(parca.getDesempenho());
    }
}
