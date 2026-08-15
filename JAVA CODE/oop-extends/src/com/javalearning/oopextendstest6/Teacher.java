package com.javalearning.oopextendstest6;

public class Teacher extends Person {
    String subject;

    // 快捷键ALT+INSERT
    public Teacher() {
        System.out.println("Teacher的空参构造方法执行");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher的有参构造方法执行");
    }
}
