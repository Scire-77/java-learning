package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo3 {
    public static void main(String[] args) {
        // 卡拉兹函数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();

        if(n>0){
            if(n % 2 ==0){
                System.out.println("偶数");
                n = n/2;
                System.out.println("输出结果：" + n);
            }else{
                System.out.println("奇数");
                n = 3*n + 1 ;
                System.out.println("输出结果：" + n);
            }

        }else{
            System.out.println("请输入一个正整数");
        }
    }
}
