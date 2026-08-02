package com.javalearning.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 数组遍历

        int[] arr={10,20,30,40,50};

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------");
        System.out.println(arr.length);     // length获取长度
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++){   // 数组名+.fori 直接生成循环
            System.out.println(arr[i]);
        }


    }
}
