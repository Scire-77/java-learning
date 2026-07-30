package com.javalearning.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;


        Random random = new Random();
        int n = random.nextInt(100); // 默认在int范围内随机生成
                                    // (n); n表示随机的最大值,不包含这个数.0~n-1
                                    // (a,b); a和b之间随机生成,包含a,不包含b(JDK17)

        while (num != n){
            System.out.println("请输入数字：");
            num = sc.nextInt();
            if(num > n){
                System.out.println("数字太大了");
            }else if(num < n){
                System.out.println("数字太小了");
            }else{
                System.out.println("恭喜你猜对了");
            }       // 或者条件为true,在猜对后面加break;
        }
    }
}
