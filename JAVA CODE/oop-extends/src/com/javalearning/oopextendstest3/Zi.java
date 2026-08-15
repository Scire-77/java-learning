package com.javalearning.oopextendstest3;

public class Zi extends Fu {
    String name = "Zi";

    public void show(){
        String name = "Zishow";
        System.out.println(name);   // Zishow, 直接使用name变量, 就近原则先找局部变量
        System.out.println(this.name);   // Zi  this关键字, 不去找局部变量, 找本类的成员变量(如果还是没有,也会去找父类)
        System.out.println(super.name);   // Fu  super关键字, 不去找子类,直接找父类

        // 并且利用super关键字最多只能访问到父类, 不能访问父类的父类
    }
}
