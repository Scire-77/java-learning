package com.javalearning.oopextendstest8;

public class MajorTeacher extends Teacher{

    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("正在教授专业课知识");
    }
}

