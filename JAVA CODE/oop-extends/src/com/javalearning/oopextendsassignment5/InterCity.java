package com.javalearning.oopextendsassignment5;

public class InterCity extends BasicExpress {
    public InterCity() {
    }

    public InterCity(String num, int weight, String receiver) {
        super(num, weight, receiver);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+15;
    }
}
