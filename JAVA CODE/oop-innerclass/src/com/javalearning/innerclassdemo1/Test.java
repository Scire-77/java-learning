package com.javalearning.innerclassdemo1;

public class Test {
    /*      1. 什么是内部类？
            写在一个类里面的类就叫做内部类

            2. 什么时候用到内部类？
            一个类表示的事物是另一个类的一部分，且单独存在没有意义

            3. 内部类的分类
            成员内部类: 写在成员位置的, 属于外部类的成员; 可以被一些修饰符修饰: private, protected,public static等
                        在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量
             静态内部类
             局部内部类
             匿名内部类

             4. 获取成员内部类对象的两种方式：
                方式一：外部类编写方法，对外提供内部类对象(一般是private修饰的成员内部类会采用这个方法)
                方式二：直接创建
                格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
                范例：Outer.Inner oi = new Outer().new Inner();
    * */
    public static void main(String[] args) {
        // 常规写法
        Outer o = new Outer();
        o.name = "Outer";

        // 链式(省略一个变量)
        new Outer().name = "Outer";

        // 推到成员内部类的创建格式
        Outer.Inner oi = new Outer().new Inner();   // 如果私有, 那么就不能直接创建

        // 通过外部类对象编写的方法 获取内部类对象
        o.getInnerInstance();

        // 接收方法:
        System.out.println(o.getInnerInstance());   // 直接打印输出
        Object oi2 = o.getInnerInstance();      // 多态的方法设置变量接收(内部类被private修饰的情况下, 用所有类的父类Object)

        oi.show();

    }


}
