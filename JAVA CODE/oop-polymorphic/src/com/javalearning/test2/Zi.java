package com.javalearning.test2;

public class Zi extends Fu {
    String name = "子";

    public void ziShow(){
        System.out.println("子类ziShow方法被调用");
    }

    @Override
    public void show() {
        System.out.println("子类重写的show方法被调用");
    }
}
