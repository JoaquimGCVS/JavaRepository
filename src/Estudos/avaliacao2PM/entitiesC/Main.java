package Estudos.avaliacao2PM.entitiesC;

import Estudos.avaliacao2PM.entitiesA.Color;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<AreaCalculator> shapes = new ArrayList<>();
        shapes.add(new Circle(Color.RED, 10.0));
        shapes.add(new Rectangle(Color.BLACK, 10.0, 10.0));

        for (AreaCalculator shape: shapes) {
            System.out.println("Areas: " + shape.calcArea());
        }

    }
}
