package com.javalearning.variable;

import java.util.Scanner;

public class VariableDemo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //键入整数
     /*   int num = sc.nextInt();
        System.out.println("您输入的整数是："+num);*/

        //键入小数
       /* double num2 = sc.nextDouble();
        System.out.println("您输入的小数是："+num2);*/

        //键入文本（字符串）
        String str = sc.next();
        System.out.println("您输入的文本是："+str);
    }
}
