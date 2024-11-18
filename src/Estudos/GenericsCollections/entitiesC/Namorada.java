package Estudos.GenericsCollections.entitiesC;

public class Namorada {
    private String name;

    public Namorada(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Namorada: " + getName();
    }
}
