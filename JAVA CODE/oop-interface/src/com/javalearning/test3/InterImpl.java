package com.javalearning.test3;

public class InterImpl implements InterA, InterB {
    @Override
    public void method1() {
        System.out.println("重写的接口方法1");
    }

    @Override
    public void method2() {
        System.out.println("重写的接口方法2");
    }

    @Override
    public void method3() {
        System.out.println("重写的接口方法3");
    }
}
