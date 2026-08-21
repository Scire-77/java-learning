package com.javalearning.innerclassdemo3;

public class Outer {
    int b = 20;


    public void show(){
        int a = 10;

        // 局部内部类(修饰规则和局部变量一样, 不能用public/private等修饰)
        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println(a);  //该类可以访问方法内的局部变量
                System.out.println(b);  //也可以直接访问外部类的成员
                System.out.println("局部内部类的method1方法被调用");
            }
            public static void method2(){
                System.out.println("局部内部类的method2静态方法被调用");
            }

        }

        // 类似于局部变量, 在测试类里没法直接调用局部内部类, 需要在方法中创建
        Inner i = new Inner();

        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();    // 依旧是静态方法直接类名.调用
    }
}
