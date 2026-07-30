package com.javalearning.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    // 猜数字游戏
    public static void main(String[] args) {
        // 保底机制:三次没猜中,提示猜测范围:+-10
        //十次没猜中,直接告诉正确答案

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int countA = 0;
        int countB = 0;
        Random random = new Random();
        int n = random.nextInt(100); // 默认在int范围内随机生成
        // (n); n表示随机的最大值,不包含这个数.0~n-1
        // (a,b); a和b之间随机生成,包含a,不包含b(JDK17)

        while (num != n){
            System.out.println("请输入数字：");
            num = sc.nextInt();

            countA++;
            countB++;

            // 大保底机制,技术手段解决
            if(countB == 10){
                n=num;
                System.out.println("已经十次没猜中,触发大保底!");
            }

            if(num > n){
                System.out.println("数字太大了");
            }else if(num < n){
                System.out.println("数字太小了");
            }else{
                System.out.println("恭喜你猜对了");
            }   // 或者条件为true,在猜对后面加break;

            //小保底逻辑要在下,因为可能三次之内就猜到了
            if(countA%3==0){
                System.out.println("三次没猜中,提示猜测范围:"+ (n-10) + "~" + (n+10));
            }

        }
    }
}
