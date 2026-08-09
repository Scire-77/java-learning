package com.javalearning.ooptest5;

public class Student {
    // 属性:姓名,年龄,性别,身高
    private String name;
    private int age;
    private char sex;
    private int height;

    // 构造方法: 也叫构造器,构造函数, 作用是在创建对象的同时给成员变量进行初始化(赋值)
    /*  特点1: 方法名与类名相同,大小写也一致; 特点2: 没有返回值类型(void也没有) 特点3: 没有具体的返回值(不能有return)
    *   执行时间: 创建对象时由虚拟机调用, 不能手动调用构造方法; 每创建一次对象, 就会调用一次构造方法
    *   修饰符 类名(参数){
    *              方法体;
    *       }
    *   习惯: 至少写两个构造方法, 一个空参 一个带全部参数
    * */
    // 快捷键: Alt+Insert( TAB+TAB/ CTRL+A)
    public Student(){
//        System.out.println("全参构造方法被调用");
    }

    public Student(String name, int age, char sex, int height){
//        System.out.println("全参构造方法被调用");
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }


    // get/set(ALT + INSERT)
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex(){
        return sex;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

}
