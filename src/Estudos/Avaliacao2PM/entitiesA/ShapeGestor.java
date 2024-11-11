package Estudos.Avaliacao2PM.entitiesA;

import java.util.ArrayList;

public class ShapeGestor {
    private ArrayList<Shape> shapes;
    public ShapeGestor() {
        shapes = new ArrayList<>();
    }

    public double calcTotalAreas() {
        double sum=0.0;
        for(Shape shape: shapes) {
        sum+=shape.area();
        }
        return sum;
    }
}
