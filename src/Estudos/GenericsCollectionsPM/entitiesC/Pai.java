package Estudos.GenericsCollectionsPM.entitiesC;

public class Pai {
    private String name;

    public Pai(String name) {
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
        return "Pai: " + getName();
    }
}
