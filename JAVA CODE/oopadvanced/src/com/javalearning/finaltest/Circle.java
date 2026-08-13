package com.javalearning.finaltest;

public class Circle {
    // 创建属性
    private double radius;
    private final double PI = 3.14;

    // 构造方法

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;       // 注意常量不能再次赋值
    }

    // get/set

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;              // 注意常量不能再次赋值, 没有set方法
    }


    // 行为
    public double getArea(){
        return PI * radius * radius;
    }

    public double getLength(){
        return 2 * PI * radius;
    }


}
