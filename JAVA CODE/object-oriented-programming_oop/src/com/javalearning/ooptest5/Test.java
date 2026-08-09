package com.javalearning.ooptest5;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName()+", "+s.getAge()+", "+s.getHeight()+", "+s.getSex());

        Student s1 = new Student("小王", 18, '男', 180);
        System.out.println(s1.getName()+", "+s1.getAge()+", "+s1.getHeight()+", "+s1.getSex());

        /*
        *   构造方法补充:
        *   1. 没有定义构造方法, 系统给出默认的无参构造方法
        *   2. 如果自己写了任意的构造方法,系统将不再提供默认的构造方法
        *   3. 带参构造方法与无参数构造方法,方法名相同,但是参数不同,这叫构造方法的重载
        *
        *   4.所以习惯于: 不论是否使用,都手动书写无参数的构造方法和全部参数的构造方法
        * */
    }
}
