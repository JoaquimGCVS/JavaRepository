package Estudos.designpatterns.Factory;

import java.util.List;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.ingredients= List.of(
                new Ingredient("Minas Cheese"),
                new Ingredient("Cheddar"),
                new Ingredient("Simpel cheese"));
    }

}
