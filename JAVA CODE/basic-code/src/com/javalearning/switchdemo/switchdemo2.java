package com.javalearning.switchdemo;

import java.util.Scanner;

public class switchdemo2 {
    public static void main(String[] args) {
        //switch模拟计算器
        int a = 10;
        int b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算符号：");
        char op = sc.next().charAt(0);


        int result = switch(op){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> 0;
        };
        // 想要调用switch的结果，必须使用yield关键字,语句体只有一行可以省略写
        System.out.println(result);
    }
}
