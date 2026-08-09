package com.javalearning.ooptest1;

public class Test {
    public static void main(String[] args) {
        // main方法中创建对象,叫做测试类
        // 类名 对象名 = new 类名();

        Dog d1 = new Dog();

        d1.name = "旺财";
        d1.age = 5;
        d1.weight = 10.5;
        d1.color = "白色";

        // 获取信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);

        // 创建第二个对象
        Dog d2 = new Dog();
        d2.name = "小黄";
        d2.age = 3;
        d2.weight = 5.5;
        d2.color = "黑色";

        // 获取信息
        System.out.println("----------");
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);
    }
}
