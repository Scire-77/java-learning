package com.javalearning.test2;

public class TableCoa extends Coach implements Speak {
    public TableCoa() {
    }

    public TableCoa(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");

    }
}
