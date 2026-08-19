package com.javalearning.test2;

public class BasketAth extends Athlete {
    public BasketAth() {
    }

    public BasketAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学打篮球");
    }
}
