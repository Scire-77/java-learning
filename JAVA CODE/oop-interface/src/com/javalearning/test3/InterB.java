package com.javalearning.test3;

public interface InterB {
    // 新增一个默认方法
    public default void method3() {
        System.out.println("InterB新增的默认方法method3");
    }
}
