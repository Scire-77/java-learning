package com.javalearning.oopextendstest8;

public class Teacher extends Person{
    String subject;

    // 构造方法

    public Teacher() {

    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // get/set

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 行为
    public void teach() {
        System.out.println("正在教书");
    }
}
