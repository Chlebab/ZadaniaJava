package org.example.klasy;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); // Wywołanie nadklasowej wersji metody makeSound()
        System.out.println("Dog barks");
    }
}
