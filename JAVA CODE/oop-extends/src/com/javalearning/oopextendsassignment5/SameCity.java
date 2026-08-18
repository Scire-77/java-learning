package com.javalearning.oopextendsassignment5;

public class SameCity extends BasicExpress {
    public SameCity() {
    }

    public SameCity(String num, int weight, String receiver) {
        super(num, weight, receiver);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+10;
    }
}
