package com.javalearning.oopextendstest8;

public class MasterStudent extends Student{
    // 属性

    // 构造方法

    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    // get/set

    // 行为

    @Override
    public void study() {
        System.out.println("正在学习硕士知识");
    }

    @Override
    public void sleep() {
        System.out.println("硕士研究生住宿条件升级，在豪华版学生公寓睡觉");
    }
}
