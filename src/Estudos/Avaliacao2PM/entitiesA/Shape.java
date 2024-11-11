package Estudos.Avaliacao2PM.entitiesA;

public abstract class Shape {
    private Color color;
    public Shape(Color color) {
        setColor(color);
    }
    public abstract double area();
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color=color;
    }

}
