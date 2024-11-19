package Estudos.generics.entitiesB;

import java.util.ArrayList;
import java.util.List;

public class BagNinja<T> {  // T = tipo generico
    //inicializar array generico
    private List<T> ferramentas;

    //inicializar construtor
    public BagNinja() {
        ferramentas = new ArrayList<>();
    }
    //colocar as ferramentas no Array
    public void addFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }
    public void removeFerramenta(T ferramenta) {
        ferramentas.remove(ferramenta);
    }
    public void getFerramentas() {
        for (T ferramenta: ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
