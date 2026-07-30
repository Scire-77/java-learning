package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo6 {
    public static void main(String[] args) {
        //判断三角形

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的第一个边");
        double a = sc.nextDouble();
        System.out.println("请输入三角形的第二个边");
        double b = sc.nextDouble();
        System.out.println("请输入三角形的第三个边");
        double c = sc.nextDouble();


        if(a<=0||b<=0||c<=0){
            System.out.println("输入的边不能小于等于0");
        }else{
            if(a+b>c&&a+c>b&&b+c>a){ //任意两边之和大于第三边,代码实现用&&
                if(a==b&&b==c){
                    System.out.println("是等边三角形"); //等边 必须放在最前面，因为等边天然满足等腰条件，若不先判断等边会被误判为等腰
                }else if(a==b||a==c||b==c){
                    System.out.println("是等腰三角形");
                }else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                    System.out.println("是直角三角形");
                }else{
                    System.out.println("是普通三角形");
                }
            }else{
                System.out.println("不是三角形");
            }
        }
    }
}
