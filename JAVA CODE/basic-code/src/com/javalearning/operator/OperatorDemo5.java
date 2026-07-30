package com.javalearning.operator;

import java.util.Scanner;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //输入四位数，判断是否是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = sc.nextInt();

        int ge = num % 10;
        int bai = num / 100 % 10;
        int shi = num / 10 % 10;
        int qian = num / 1000 % 10;

        boolean result = ge==qian && shi==bai;
        //&&与||是短路逻辑运算符，即左操作数和右操作数的判断可以省略；相比于&和|，&&和||的判断速度更快
        System.out.println(result);
    }
}
