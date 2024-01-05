package org.example.wcs.java._07;


public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 145000);
        Boat boat = new Boat("Iguana", 56000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
