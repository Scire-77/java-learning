package com.javalearning.test4;

public class InterImpl implements Inter {

    // 实现类中想@Override重写静态方法会报错
    // 只有虚方法才能重写(非static\非final\非private), 重写的意义是替换虚方法表里的地址


    // 此时相当于接口和实现类中碰巧有两个同名的方法而已, 不构成重写关系
    public void method1() {
        System.out.println("接口方法method1");
    }
}
