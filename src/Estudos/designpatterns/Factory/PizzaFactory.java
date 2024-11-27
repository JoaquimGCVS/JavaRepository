package Estudos.designpatterns.Factory;

public class PizzaFactory {
    private PizzaFactory(){
    }
    public static Pizza getInstance(boolean sweet) {                 // se true = pizza doce, else nao doce
        return sweet ? new ChocolatPizza() : new CheesePizza();      // centraliza a criacao de novas instancias
    }                                                                // utiliza abstracao (Pizza)
                                                                     // encapsula a regra de negocio de criacao de novos produtos
}
