package Estudos.generics.entitiesD;

import java.util.ArrayList;
import java.util.List;

public class Array<T> {
    private List<T> array;

    public Array() {
        array = new ArrayList<>();
    }
    public void addElement(T element) {
       array.add(element);
    }
    public void getAll() {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public int contarOcorrencias (T element) {
        int cont=0;
        for(T arrayElement: array) {
            if(arrayElement.equals(element)) {
                cont++;
            }
        }
        return cont;
    }
}
