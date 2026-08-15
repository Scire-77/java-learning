package com.javalearning.oopextendstest7;

public class Student {
    String name;
    int age;

    public Student() {
        this("同学", 18);         // 相当于调用本类中的有参构造, 想让对象有默认值时可以采用(也可以直接在成员变量赋值)
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
