package com.javalearning.test3;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public void honk() {
        System.out.println("Car horn is honking");
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " is moving at " + getSpeed() + " km/h");
    }
}
