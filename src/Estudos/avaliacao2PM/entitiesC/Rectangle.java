package Estudos.avaliacao2PM.entitiesC;

import Estudos.avaliacao2PM.entitiesA.Color;

public class Rectangle extends Shape implements AreaCalculator {
    private double width;
    private double height;
    public Rectangle(Color color, double width, double height) {
        super(color);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
