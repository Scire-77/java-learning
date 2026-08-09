package com.javalearning.ooptest4;

public class Student {
    // 私有属性: 姓名, 年龄, 身高, 体重 行为: 学习
    private String name;
    private int age;
    private int height;
    private int weight;

    // 对私有属性定义getset方法
    /*  就近原则:在方法中直接使用变量查找顺序:先找局部变量,再找成员变量.
    *   如果局部变量与成员变量重名,需要用this关键字访问成员变量
    *
    * */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

    // 行为
    public void study(){
        System.out.println(name+"正在学习...");
    }

}
