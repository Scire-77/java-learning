package com.javalearning.oopextendstest6;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类空参构造方法执行");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造方法执行");
    }
}
