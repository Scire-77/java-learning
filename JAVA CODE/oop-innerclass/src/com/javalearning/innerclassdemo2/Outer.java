package com.javalearning.innerclassdemo2;

public class Outer {
    int a = 10;
    static int B = 20;

    static class Inner{
        public void show1(){
            System.out.println("静态内部类的非静态方法被调用");
            Outer o = new Outer();
            System.out.println(o.a);    // 想要访问非静态的需要提取创建对象
            System.out.println(B);
        }

        public static void show2(){
            System.out.println("静态内部类的静态方法被调用");
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(B);
        }
    }
}
