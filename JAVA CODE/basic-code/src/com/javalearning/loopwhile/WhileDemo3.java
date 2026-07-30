package com.javalearning.loopwhile;

import java.util.Scanner;

public class WhileDemo3 {
    /*
    * 数位之和,给定整数n,计算所有数位之和,n为负数则转换为正数
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();

        int sum=0;

        if(n<0){
            n = -n;
        }
        /*
        * 123%10 --> 获取个位3
        * 123/10 --> 删去个位,获得12
        * 12%10 --> 获取个位2
        * 12/10 --> 删去个位,获得1
        * 1%10 --> 获取个位1
        * */
        while (n!= 0){
            sum += n%10;
            n=n/10;
        }
        System.out.println( sum);

    }
}
