package org.example.wcs.java._07;

public class Car extends Vehicle{
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}
