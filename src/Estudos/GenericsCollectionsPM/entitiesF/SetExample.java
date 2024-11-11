package Estudos.GenericsCollectionsPM.entitiesF;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] arg) {
        Set<Pessoa> pessoas = new HashSet<>();// HashSet usa código hash para organizar elementos,
        // mas não garante uma ordem específica ao imprimir
        pessoas.add(new Pessoa(1L,"Joaquim"));
        pessoas.add(new Pessoa(2L,"Anna"));
        pessoas.add(new Pessoa(2L,"Anna"));
        System.out.println("Pessoas: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa); // aqui apenas uma Anna vai ser impressa, pois set nao permite duplicacao
        }
        System.out.println();
        pessoas.add(new Pessoa(1L,"Anna"));
        System.out.println("Pessoas: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa); // aqui duas Annas vao ser impressas, pois o id foi modificado, e ja nao sao iguais
        }
    }
}
