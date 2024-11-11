package Estudos.GenericsCollectionsPM.entitiesE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic<K,V extends Comparable<V>>{ // usa extends pois esta aplicando um regra de negocio
    // (restricao de tipo) para Generic V, e nao implementando algo como compareTo()
    private Map<K,V> mapeador;
    public Generic() {
        mapeador = new HashMap<>();
    }
    public void addElements(K key, V value) {
        mapeador.put(key,value);
    }
    public V max() {
        if (mapeador.isEmpty()) {
            return null;
        }

        V max = null;
        for (V value : mapeador.values()) {
            if (max == null || value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
    public void getByValue () {

    }
}
