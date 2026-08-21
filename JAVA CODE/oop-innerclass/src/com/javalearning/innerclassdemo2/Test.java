package com.javalearning.innerclassdemo2;

public class Test {
    /*  # 静态内部类 (也是成员内部类的一种)
        1. 静态内部类只能访问外部类中的静态变量和静态方法(静态只能访问静态的规则)
        2. 如果在静态内部类中，想要访问外部类非静态的内容，需要创建外部类的对象

        **创建静态内部类的对象：**
        外部类名.内部类名 对象名 = new 外部类名.内部类名();

        **调用静态内部类中非静态方法的格式：**
        先创建对象，用对象调用

        **调用静态内部类中静态方法的格式：**
        外部类名.内部类名.方法名();
    * */
    public static void main(String[] args) {
        // 创建静态内部类对象 (只要是静态的东西, 就可以类名.直接获取)\
        Outer.Inner oi = new Outer.Inner(); // 注意new的不是Outer,而是Outer里Inner的对象

        oi.show1();
        Outer.Inner.show2();    // 可以对象oi.show2调用静态方法, 但还是同之前一样,直接类名.调用更符合规范
    }
}
