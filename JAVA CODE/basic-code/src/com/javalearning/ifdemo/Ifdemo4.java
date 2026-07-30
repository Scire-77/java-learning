package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        double money = sc.nextDouble();
        double balance = 0;

        if(money > 0){
            if (money<1000){
                balance = money;
            }else if(money<2000){
                balance = money + 200;
            }else if(money<3000){
                balance = money + 500;
            }else if(money<5000){
                balance = money + 700;
            } else if (money < 10000) {
                balance = money + 1300;
            }else if(money<20000){
                balance = money + 2500;
            }else if(money<50000){
                balance = money + 6000;
            }else{
                balance = money + 15000;
            }
            System.out.println("充值成功，余额为：" + balance);
        }else{
            System.out.println("充值金额不能小于0");
        }

    }
}