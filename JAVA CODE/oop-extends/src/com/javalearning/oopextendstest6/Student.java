package com.javalearning.oopextendstest6;

public class Student extends Person {
    String grade;

    // 子类构造方法
    // 空参构造
    public Student(){
                        // JVM会默认有一个 super();
        System.out.println("子类Student空参构造方法执行");
    }

    // 有参构造(注意参数要包括父类中抽取的共性属性)
    public Student(String name, int age, String grade){
        // 父类中的属性, 通过super(参数)的形式传递给父类的构造方法赋值
        super(name, age);
        // 子类中的属性,自己赋值
        this.grade = grade;
        System.out.println("子类Student有参构造方法执行");
    }
}
