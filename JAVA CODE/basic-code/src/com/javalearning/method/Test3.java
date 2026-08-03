package com.javalearning.method;

import java.util.Scanner;

public class Test3 {
    /* 计算邮费:运费规则如下,首重1kg,超出部分按kg计算;不足1kg的按1kg计算. 首重1kg:10元 超出1-5kg:每kg加2元
    * 超出5kg及以上,每kg加1.5元. 键盘录入小数,表示用户快递的重量,计算最终费用
    *要求1: 快递重量必须大于0,否则重新输入
    * 2: 不同价位的计算,单独定义一个方法
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入快递重量(kg):");

        // 获取用户输入的快递重量
        double weight = sc.nextDouble();
        while(weight <= 0){
            System.out.println("请输入正确的重量(kg):");
            weight = sc.nextDouble();
        }

        // 调用方法,获取运费
        if(weight <= 1){
            double price = getPrice1(weight);
            System.out.println("运费为:" + price);
        }else if(weight < 6){
            double price = getPrice2(weight);
            System.out.println("运费为:" + price);
        }else{
            double price = getPrice3(weight);
            System.out.println("运费为:" + price);
        }

    }

    // 定义第一个价位的方法(不足1kg)
    public static double getPrice1(double weight){
        return 10.0;
    }

    // 定义第二个价位的方法(超出首重1-5kg)
    public static double getPrice2(double weight){
        double extra = weight - 1;  // 获取超出1kg的数值
        int extraInt = (int)extra;  // 获取超出1kg的整数部分
        if(extra > extraInt){       //如果小数部分大于0,那么超出的数值会大于截断后的整数部分,则将整数部分加1
            extraInt++;
        }
        return extraInt*2 + 10;
    }

    // 定义第三个价位的方法(超出5kg及以上)
    public static double getPrice3(double weight){
        double extra = weight - 1;  // 获取超出1kg的数值
        int extraInt = (int)extra;  // 获取超出1kg的整数部分
        if(extra > extraInt){       //如果小数部分大于0,那么超出的数值会大于截断后的整数部分,则将整数部分加1
            extraInt++;
        }
        return  (extraInt-4)*1.5 + 10 + 4*2;
    }
}


