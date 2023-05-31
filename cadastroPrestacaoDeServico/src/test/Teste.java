package test;

import java.util.Date;

import implement.Colaborador;
import implement.Parceiro;

public class Teste {
    public static void main(String[] args) {
        Colaborador colab = new Colaborador();
        Parceiro parca = new Parceiro();

        colab.setNome("João");
        System.out.println("Nome: " + colab.getNome());

        colab.setNasc(1992, 9, 18);
        System.out.println("Nascimento: " + colab.getNasc());

        parca.setDesempenho(10.0);
        System.out.println("Desempenho: " + parca.getDesempenho());

        parca.setFundacao(new Date("1992/09/18"));
        System.out.println("Fundação: " + parca.getFundacao());
    }
}
