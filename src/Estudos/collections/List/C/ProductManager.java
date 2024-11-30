package Estudos.collections.List.C;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public double getAveragePrice() {
        double average = products.stream().mapToDouble(Product::getPrice).average().orElse(0.0);
        return average;
    }
}
