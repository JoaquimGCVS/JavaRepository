package Estudos.collections.List.A;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Joaquim", 18));
        listaDePessoas.add(new Pessoa("Adriana", 18));
        listaDePessoas.add(new Pessoa("Camila", 18));

        System.out.println("First person of list:" + listaDePessoas.getFirst());
        System.out.println("List size:" + listaDePessoas.size());
        System.out.println("Persons of list:" + listaDePessoas);

    }
}
