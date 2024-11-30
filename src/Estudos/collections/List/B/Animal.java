package Estudos.collections.List.B;

public abstract class Animal {
    String name;
    public Animal (String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name: " + this.getName();
    }
}
