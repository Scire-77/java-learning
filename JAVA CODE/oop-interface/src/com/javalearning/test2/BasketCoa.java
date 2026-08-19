package com.javalearning.test2;

public class BasketCoa extends Coach{

    public BasketCoa() {
    }

    public BasketCoa(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教打篮球");
    }
}
