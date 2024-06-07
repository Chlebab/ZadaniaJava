package org.example.klasy;

public class Car {
    private String colour;

    public Car(String colour) {
        this.colour = colour;
    }

    public Car shallowCopy() {
        return new Car(this.colour);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
