package Estudos.GenericsCollections.entitiesB;

public class Kunai {
    private String name;

    public Kunai(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Nome: " + getName();
    }
}
