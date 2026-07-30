package com.javalearning.controllerloop;

import java.util.Scanner;

public class ControllerLoopDemo3 {
    // 判断质数,输入一个大于等于2的数字,判断是否是质数
    // 质数: 只能被1和自身整除的数

    /*
    * num=100;
    * 1 100
    * 2 50
    * 4 25
    *5 20
    * 10 10       成对出现,且其中一个数字小于等于平方根,  另一个数字是大于等于平方根的
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;

        while(true){
            System.out.println("请输入大于等于2的数字：");
            num = sc.nextInt();
            if(num<2){
                System.out.println("请输入大于等于2的数字!");
            }else{
                break;
            }
        }

                                            // i<num可以替换成i<=Math.sqrt(num)
        for(int i = 2; i < num; i++){       // 1~n 有2个因数，1和自身. --> 那么2~n-1,如果有0个可以用于整除的数,那么就是质数
            if(num % i == 0){
                count++;
//                System.out.println("不是质数");  同下,可以写for内部,但是质数的判断必须要等循环结束,所以不能在else内部写
                break;  // 只要count++ > 0,则不是质数,后面的数字都不用判断了
            }
        }

        if(count == 0){
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
