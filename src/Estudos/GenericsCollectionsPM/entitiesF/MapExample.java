package Estudos.GenericsCollectionsPM.entitiesF;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main (String[] arg) {
        Map<Long, Pessoa> pessoas = new HashMap<>(); // esse long nao eh o id da classe pessoa, mas por boa pratica, sao iguais
        // mas o id que vai ser criado para mapeamento
        pessoas.put(1L,new Pessoa(1L,"Joaquim")); //mapeando cada id (Long) para um objeto Pessoa.
        pessoas.put(2L,new Pessoa(2L,"Anna")); // O HashMap permite acessar os valores rapidamente usando a chave.
        System.out.println("Pessoas");
//        for (Pessoa pessoa:pessoas) {
//            System.out.println(pessoa);
//        }
        // este metodo nao funciona pois map nao eh uma lista
        // map serve para o mapeamento e rastreamento pratico e rapido de dados
        // dessa forma, para encontrar um dado com eficiencia, e sem exigir muito da maquina se faz assim:
        System.out.println(pessoas.get(1L));  // retorna a pessoa de long 1;
        System.out.println(pessoas.get(2L));  // retorna a pessoa de long 2;
    }
}
