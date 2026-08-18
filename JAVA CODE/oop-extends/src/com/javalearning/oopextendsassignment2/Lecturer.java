package com.javalearning.oopextendsassignment2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("讲师的工作是讲解");
    }
}
