package com.javalearning.loopwhile;

public class WhileDemo1 {
    // 投资十万,复利1.7%,几年后能实现本金翻倍
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while(money<200000){
            money = money * 1.017;
            count++;
        }
        System.out.println("需要"+count+"年");
    }
}
