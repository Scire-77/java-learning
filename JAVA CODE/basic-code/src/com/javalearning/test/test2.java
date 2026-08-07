package com.javalearning.test;

import java.util.Random;

public class test2 {
    // 红包问题:M表示红包总额,N表示红包个数,有N个人抽红包,每个人都是随机的,打印每个人领取到的红包金额
    // 要求1:每人最少1分钱 2: 每个人领完后,至少预留1*N分钱 3:最后一个人拿的是剩余的总额
    public static void main(String[] args) {
        int money = 20000;
        int person = 5 ;

        Random random = new Random();

        // 判断范围
        if(money < person){
            System.out.println("金额不足");
        }else{
            // 利用循环分发红包,且只随机 person - 1 个人,最后一个人不参与随机
            for (int i = 1; i < person; i++) {      // 修改条件满足最后一人不随机
                int mymoney = random.nextInt(money-(person-i)) + 1;      // 第1 2 3 4个人,至少预留4,3,2,1分钱
                System.out.println("第" + i + "个人抢到" + mymoney);     // 第i个人能抢到的金额在money-(person-i)+1这个范围内
                                                                        // 减去person-i就是减去需要给后面人预留的金额,+1让范围从1开始
                money -= mymoney;       // 每一个人抢到后需要扣除得到剩余金额
            }
            System.out.println("第" + person + "个人抢到" + money);


        }

    }
}
