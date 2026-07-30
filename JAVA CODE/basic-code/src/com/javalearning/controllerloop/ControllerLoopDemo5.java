package com.javalearning.controllerloop;

public class ControllerLoopDemo5 {
    public static void main(String[] args) {
        //逢7过;1-100;数字包含7或者7的倍数,输出过

        for (int i = 0; i <= 100; i++) {
            if(i%7==0 || i%10==7 || i/10%10==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}
