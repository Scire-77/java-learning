package com.javalearning.oopextendsassignment2;

public class Employee {
    private int num;
    private String name;

    // 无参构造函数
    public Employee() {
    }

    // 有参构造函数
    public Employee(int num, String name) {
        this.num = num;
        this.name = name;
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

    // 行为
    public void work() {
        System.out.println("正在工作");
    }
}
