package com.javalearning.variable;

public class VariableDemo {
    public static void main(String[] args) {
        double wx = 0 ;
        double zfb = 10 ;
        double card = 20 ;
        System.out.println("现在一共有："+(wx+zfb+card));
        wx += 10 ;
        System.out.println("微信现在有："+wx);
        wx -= 2;
        System.out.println("微信现在有："+wx);
    }
}
