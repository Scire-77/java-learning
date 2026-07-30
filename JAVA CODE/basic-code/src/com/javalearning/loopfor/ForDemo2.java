package com.javalearning.loopfor;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入范围1：");
        int a = sc.nextInt();
        System.out.println("请输入范围2：");
        int b = sc.nextInt();

        int max = a>b?a:b;
        int min = a<b?a:b;

        int count = 0;

        for(int i = min; i <= max; i++){
            if(i%3==0 && i%5==0){       // if(i%15==0)
                count++;
            }
        }
        System.out.println( count);
    }
}
