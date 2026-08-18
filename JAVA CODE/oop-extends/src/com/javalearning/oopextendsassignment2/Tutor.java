package com.javalearning.oopextendsassignment2;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("助教的工作是帮助教学");
    }
}
