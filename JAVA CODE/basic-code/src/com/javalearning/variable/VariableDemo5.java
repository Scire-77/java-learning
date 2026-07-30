package com.javalearning.variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("输入的整数之和是："+(num+num2));
    }
}
