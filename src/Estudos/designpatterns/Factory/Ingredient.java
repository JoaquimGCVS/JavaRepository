package Estudos.designpatterns.Factory;

public class Ingredient {
    private String name;
    public Ingredient (String name) {
        setName(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String toString(){
        return "Name: " + getName();
    }
}
