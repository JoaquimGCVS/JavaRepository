package Estudos.avaliacao2PM.entitiesC;

import Estudos.avaliacao2PM.entitiesA.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
