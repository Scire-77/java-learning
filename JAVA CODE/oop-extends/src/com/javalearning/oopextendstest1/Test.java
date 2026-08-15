package com.javalearning.oopextendstest1;

public class Test {
    public static void main(String[] args) {

        /*  继承: 面向对象基本特征之一, 可以让类和类之间产生父子关系
        *   继承的作用:
        *       操作: 多个子类中重复的代码抽取到父类中, 子类可以直接使用
        *       好处: 减少代码冗余, 提高复用性
        *   继承的格式:
        *       public class 子类 extends 父类{}
        *   对于子类的好处:
        *       1. 子类可以得到父类的属性和行为, 子类可以使用
        *       2. 子类可以在父类的基础上新增其他功能, 子类更强大
        * */
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.grade = "高三";
        System.out.println(s.name + " " + s.age + " " + s.grade);
        s.eat();
        s.study();

        System.out.println("-------------------");

        Teacher t = new Teacher();
        t.name = "张老师";
        t.age = 30;
        t.subject = "数学";
        System.out.println(t.name + " " + t.age + " " + t.subject);
        t.eat();
        t.teach();
    }
}
