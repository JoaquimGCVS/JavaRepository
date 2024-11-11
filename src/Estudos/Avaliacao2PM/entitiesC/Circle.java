package Estudos.Avaliacao2PM.entitiesC;

import Estudos.Avaliacao2PM.entitiesA.Color;

public class Circle extends Shape implements AreaCalculator{
    private double radius;
    public Circle(Color color, double radius) {
        super(color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI*Math.pow(radius,2);
    }
}
