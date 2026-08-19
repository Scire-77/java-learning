package com.javalearning.test2;

public class TableAth extends Athlete implements Speak {
    public TableAth() {
    }

    public TableAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");

    }
}
