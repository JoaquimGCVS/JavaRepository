package Estudos.GenericsCollectionsPM.entitiesH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main (String[] arg) {
        List<Product> array = new ArrayList<>();
        array.add(new Product("Camisa A",300.0));
        array.add(new Product("Camisa C",100.0));
        array.add(new Product("Camisa B",500.0));
        Collections.sort(array,reverseOrder());
        for (Product p : array) {
            System.out.println(p.getName() + ", " + p.getValue());
        }
    }
}
