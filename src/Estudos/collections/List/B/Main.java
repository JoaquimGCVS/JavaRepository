package Estudos.collections.List.B;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Luke"));
        animals.add(new Dog("Laika"));
        for (Animal animal : animals) {
            if (animal instanceof Dog dog) {
                System.out.println(dog.getName());
            }
        }

        animals.stream()
                .filter(animal -> animal instanceof Dog) // Filtra apenas os objetos da classe Dog
                .map(animal -> (Dog) animal)            // Faz o cast para Dog
                .forEach(dog -> System.out.println("Cachorro: " + dog.getName()));
    }
}
