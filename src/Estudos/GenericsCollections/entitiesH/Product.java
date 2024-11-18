package Estudos.GenericsCollections.entitiesH;

public class Product implements Comparable<Product> {
    private String name;
    private double value;

    public Product(String name, double value) {
        setName(name);
        setValue(value);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value=value;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.getValue(),other.getValue());
    }
}
