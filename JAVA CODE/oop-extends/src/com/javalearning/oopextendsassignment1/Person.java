package com.javalearning.oopextendsassignment1;

public class Person {
    private int num;
    private String name;
    private int salary;

    // 构造函数
    public Person() {
    }

    public Person(int num, String name, int salary) {
        this.num = num;
        this.name = name;
        this.salary = salary;
    }

    // get/set
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // 行为
    public void work(){
        System.out.println("正在工作");
    }

    public void eat(){
        System.out.println("正在吃米饭");
    }
}
