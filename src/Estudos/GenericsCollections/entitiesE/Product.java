package Estudos.GenericsCollections.entitiesE;

public class Product implements Comparable<Product>{ // usa implements pois a classe se compromote a implementar compareTo()
    private String name;
    private Double value;

    public Product(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.value,other.value);
    }

    @Override
    public String toString() {
        return "Product {" +
                " Name= " + getName()  +
                ", Value= R$" + getValue() +
                " }";
    }
}
