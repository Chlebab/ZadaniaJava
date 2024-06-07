package org.example;

import org.example.klasy.Car;

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Pink");
        Car copiedCar = originalCar.shallowCopy();
        System.out.println(copiedCar.getColour());
    }
}