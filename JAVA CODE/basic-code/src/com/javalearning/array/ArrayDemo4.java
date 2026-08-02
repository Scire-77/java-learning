package com.javalearning.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态初始化
        int[] arr = new int[5];

        System.out.println("输入五个整数:");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // int num = sc.nextInt();  arr[i] = num;
        }

        System.out.println("输出数组元素:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
