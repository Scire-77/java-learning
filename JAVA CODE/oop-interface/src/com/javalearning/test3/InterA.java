package com.javalearning.test3;

public interface InterA {
    public abstract void  method1();
    public abstract void method2();

    // 新增一个默认方法
    public default void method3() {
        System.out.println("InterA新增的默认方法method3");
    }
}
