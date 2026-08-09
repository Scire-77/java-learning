package com.javalearning.ooptest2;

public class Test {
    public static void main(String[] args) {
        // 创建老师的对象
        Teacher t1 = new Teacher();
        // 赋值
        t1.name = "小王";
        t1.age = 18;
        // 获取信息
        System.out.println(t1.name);
        System.out.println(t1.age);

        // 调用行为
        t1.teach();
        t1.eat();
        t1.sleep();
    }
}
