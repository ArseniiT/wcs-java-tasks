package org.example.wcs.java._07;

public class Boat extends Vehicle{
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}
