package com.javalearning.finaltest;

public class Test2 {
    /*  final练习: 创建一个圆的类,属性是半径和圆周率, 行为是求面积和周长
    * */
    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("圆的半径是:"+c.getRadius()+"，圆周率是:"+c.getPI());

        System.out.println("面积: " + c.getArea() + " 周长: " + c.getLength());

    }
}
