package Estudos.GenericsCollections.entitiesF;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main (String[] arg) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "Joaquim"));
        pessoas.add(new Pessoa(2L, "Anna"));
        pessoas.add(new Pessoa(2L, "Anna"));
        System.out.println("Pessoa 1 igual a pessoa 2?");
        System.out.println(pessoas.get(0).equals(pessoas.get(1)));
        System.out.println("Pessoa 2 igual a pessoa 3?");
        System.out.println(pessoas.get(1).equals(pessoas.get(2)));
        System.out.println("Pessoas: ");
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        pessoas.remove(pessoas.get(2));
        System.out.println("Pessoas pos remocao: ");
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
