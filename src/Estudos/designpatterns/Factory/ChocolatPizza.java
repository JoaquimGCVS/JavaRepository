package Estudos.designpatterns.Factory;

import java.util.List;

public class ChocolatPizza extends Pizza {
    public ChocolatPizza() {
        this.ingredients = List.of(
                new Ingredient("Chocolat"),
                new Ingredient("Cheese"));
    }
}
