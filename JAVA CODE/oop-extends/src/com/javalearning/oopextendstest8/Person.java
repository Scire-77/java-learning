package com.javalearning.oopextendstest8;

public class Person {
    // 属性
    private String name;
    private int age;

    // 构造方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void eat(){
        System.out.println("正在吃饭");
    }

    public void sleep(){
        System.out.println("正在睡觉");
    }
}
