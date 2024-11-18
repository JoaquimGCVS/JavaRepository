package Estudos.GenericsCollections.Aentity;

import java.util.HashMap;
import java.util.Map;

public class GenericClassTwo<K,V> {
    Map<K,V> mapeador;

    public GenericClassTwo () {
        mapeador= new HashMap<>();
    }

    // Map interface
    public void addMapElement (K key, V value) {
        mapeador.put(key,value);
    }
    public void removeMapElement (K key) {
        mapeador.remove(key);
    }
    public void mapGetAll() {
        for (V value : mapeador.values()) { // retorna uma coleção contendo todos os valores associados às chaves do Map.
            System.out.println(value); // exige um toString para imprimir da forma desejada
        }
    }
    public void mapFindByKey (K key) {
        System.out.println(mapeador.get(key));
    }
}
