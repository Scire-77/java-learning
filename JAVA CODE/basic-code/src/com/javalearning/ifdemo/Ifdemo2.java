package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费价格：");
        double price = sc.nextDouble();

        double A = price * 0.9;
        double B = price;

        if(price>0) {
            if (B >= 30) {
                B -= 10;
            }
            System.out.println("A软件价格为：" + A);
            System.out.println("B软件价格为：" + B);
            if (A > B) {
                System.out.println("B软件更划算");
            } else if (A == B) {
                System.out.println("A和B一样划算");
            } else {
                System.out.println("A软件更划算");
            }
        }else {
            System.out.println("请输入正确的价格");
        }
    }
}
