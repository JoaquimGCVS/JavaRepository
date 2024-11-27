package Estudos.designpatterns.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected List<Ingredient> ingredients;
    public Pizza(){
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public String toString(){
        return "Ingredients list: " + getIngredients();
    }
}
