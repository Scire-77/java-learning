package com.javalearning.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        System.out.println("输入秒钟数：");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int mins = (seconds%3600)/60;
        int sec = seconds % 3600 % 60;
        // 总秒数 - 小时数（3661-3600=61）= 剩余秒数
        // 剩余秒数 / 60 = 分钟数
        // 剩余秒数 % 60 = 秒数
        System.out.println(hours);
        System.out.println(mins);
        System.out.println(sec);
    }
}
