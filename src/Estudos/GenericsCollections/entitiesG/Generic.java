package Estudos.GenericsCollections.entitiesG;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {
    List<T> array;
    public Generic() {
        array = new ArrayList<>();
    }
    public void addElement(T element) {
        array.add(element);
    }
    public void getAll() {
        System.out.print("[");
        if (!array.isEmpty()) {
            System.out.print(array.getFirst());
        }
        for (int i=1;i<array.size();i++) {
            System.out.print(", " + array.get(i));
        }
        System.out.print("]");
        System.out.println();
    }
    public T getEspecificValue(int n) {
        return array.get(n);
    }
}
