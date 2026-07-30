package com.javalearning.operator;

import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {
        System.out.println("请在键盘录入一个三位整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("按照个位、十位、百位拆分后分别是：");
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 10 / 10 %10;
//        int bai = num / 100 % 10;
//        int bai = num /100;
        System.out.println("个位数是："+ge);
        System.out.println(shi);
        System.out.println(bai);
        //公式总结：个位数 = num % 10
        //十位数 = num / 10 % 10
        //百位数 = num / 100 % 10
        //千位数 = num / 1000 % 10
    }
}
