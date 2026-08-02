package com.javalearning.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        // 获取元素
        int num1 = arr[0];
        System.out.println(num1);
        System.out.println(arr[1]);

        // 修改元素
        arr[0] = 100;
        System.out.println(arr[0]);  // 100 20 30 40 50
    }
}
