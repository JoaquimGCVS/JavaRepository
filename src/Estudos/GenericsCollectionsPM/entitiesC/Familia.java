package Estudos.GenericsCollectionsPM.entitiesC;

import java.util.ArrayList;
import java.util.List;

public class Familia<T>{
    private List<T> familia;

    public Familia() {
        familia = new ArrayList<>();
    }

    public void addFamiliar(T familiar) {
        familia.add(familiar);
    }

    public void removeFamiliar(T familiar) {
        familia.add(familiar);
    }

    public void getAll() {
        for (T familiar : familia) {
            System.out.println(familiar);
        }
    }

}
