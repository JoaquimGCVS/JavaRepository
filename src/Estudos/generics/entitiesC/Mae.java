package Estudos.generics.entitiesC;

public class Mae {
    private String name;

    public Mae(String name) {
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
        return "Mae: " + getName();
    }
}
