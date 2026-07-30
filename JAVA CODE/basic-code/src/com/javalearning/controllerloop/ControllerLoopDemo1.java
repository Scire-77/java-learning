package com.javalearning.controllerloop;

public class ControllerLoopDemo1 {
    // 循环快速生成:次数.fori+回车
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i==15){
                break; //跳出整个for循环
            }
            System.out.println( i);
        }
    }
}
