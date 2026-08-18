package com.javalearning.oopextendstest8;

public class Student extends Person {
    private String grade;

    // 构造方法

    public Student() {

    }

    public Student(String name, int age, String grade) {
        super(name, age);       // 注意子类调用父类构造函数写法
        this.grade = grade;
    }

    // get/set方法 (注意此时的get/set只用写一对子类中独有属性的即可, 不用写父类包含的共有属性的get/set方法)

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //行为
    public void study() {
        System.out.println("正在学习");
    }
}
