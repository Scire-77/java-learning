package com.javalearning.switchdemo;

import java.util.Scanner;

public class switchdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期：");
        int week = sc.nextInt();
        //case后面必须是真实数据,不能是变量,不能重复
        // switch中表达式可以是int/short/byte型变量，char型变量，String型变量，枚举型变量
        switch(week){
            case 1:
                System.out.println("今天是周一,跑步");
                break;
            case 2:
                System.out.println("今天是周二,游泳");
                break;
                case 3:
                System.out.println("今天是周三,看电影");
                break;
                case 4:
                System.out.println("今天是周四,看电影");
                break;
                case 5:
                System.out.println("今天是周五,看电影");
                break;
                case 6:
                case 7:
                System.out.println("今天是周末,看电影");
                break;
                default:
                System.out.println("输入的星期值有误！");
                break;
        }       /*
                    1. case和default位置没有上下之分,位置可以任意,为了提高阅读性,一般case从小到大,default最后
                    default可以省略不写,如果这时候不匹配CASE则没有输出结果
                   2. case穿透:如果不写break,会继续执行下一个语句,直到break或运行完整的结束
                        应用场景:多个语句体重复时.
                        1-3月为春季,case1: case2: case3:sout("春季") break;
                   3.case新特征:JDK14后: 1.箭头标签: case 1 ->{ sout("春季");}
                                        2.case后可以写多个值: case 1,2,3 ->{ sout("春季");}
                                        3.switch可以有运行结果,用yield关键字.且定义变量去接受结果
                                          String season = switch(month){
                                            case 1,2,3 ->{ yield "春季";}
                                            };(要补分号) 如果语句只有一行,大括号和yield可以省略(见demo2)
                   4. if和switch比较: 如果case选项是有限的,优先switch;判断是一个范围的话,if更适合
                   */
    }
}
