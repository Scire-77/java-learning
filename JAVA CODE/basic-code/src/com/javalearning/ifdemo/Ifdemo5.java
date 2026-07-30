package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用电量：");
        double usage = sc.nextDouble();
        double price = 0;
        if(usage >= 0) {
          if(usage<=100){
                price = usage * 0.5;
          }else if(usage<=200){
              price = 100 * 0.5 + (usage - 100) * 0.8;
          }else{
              price = 100 * 0.5 + 100 * 0.8 + (usage - 200) * 1.2;
          }
            System.out.println("usage="+usage+"，usage对应的价格是："+price);
        }else{
            System.out.println("输入的Usage值有误！");
        }
    }
}
