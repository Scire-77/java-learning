package com.javalearning.ooptest2;

public class Teacher {
    // 属性
    String name;
    int age;

    // 行为(即能干什么,以方法的形式体现,不加static)
   // 授课
   public void teach(){
       System.out.println("老师授课中...");
   }

   // 吃饭
    public void eat(){
       System.out.println("老师吃饭中...");
    }

    // 睡觉
    public void sleep(){
       System.out.println("老师睡觉中...");
    }

}
