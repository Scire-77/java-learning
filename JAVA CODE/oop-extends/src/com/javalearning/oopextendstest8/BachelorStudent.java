package com.javalearning.oopextendstest8;

public class BachelorStudent extends Student{
    // 属性

    // 构造方法

    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);    // 注意此时的全部参数(间接父类+直接父类+子类自己的参数)
    }

    // get/set

    // 行为

    @Override
    public void study() {
        System.out.println("正在学习本科知识");
    }
}
