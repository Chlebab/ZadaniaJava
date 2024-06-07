package org.example;

import org.example.klasy.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Calculator().add(1,2));
        System.out.println(new Calculator().add(1,0));
        System.out.println(Calculator.multiply(-2,5));
        System.out.println(Calculator.multiply(2,3));
    }
}