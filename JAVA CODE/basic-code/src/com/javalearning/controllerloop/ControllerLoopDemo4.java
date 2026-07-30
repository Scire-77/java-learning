package com.javalearning.controllerloop;

public class ControllerLoopDemo4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                continue; //跳出当前循环，继续下一次循环
            }
            System.out.println(i);
        }
    }
}
