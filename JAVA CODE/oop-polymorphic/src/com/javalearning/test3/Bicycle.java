package com.javalearning.test3;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " is moving at " + getSpeed() + " km/h");
    }

    public void ringBell() {
        System.out.println("Bicycle bell is ringing");
    }
}
