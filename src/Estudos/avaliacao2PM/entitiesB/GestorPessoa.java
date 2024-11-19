package Estudos.avaliacao2PM.entitiesB;

import java.util.ArrayList;

public class GestorPessoa {
    private ArrayList<Pessoa> pessoas;
    public GestorPessoa() {
        pessoas = new ArrayList<>();
    }

    public double calcImpostoTotal() {
        double sum=0.0;
        for (Pessoa pessoa : pessoas) {
            sum+=pessoa.calcImposto();
        }
        return sum;
    }
}
