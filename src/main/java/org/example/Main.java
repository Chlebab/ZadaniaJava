package org.example;

import org.example.klasy.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Wywołanie przesłoniętej metody makeSound() z klasy Dog
    }
}