package com.javalearning.array;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 打乱元素
        int[] arr ={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();                // 调用随机
            int RandomIndex = r.nextInt(arr.length);        // 生成随即索引,范围在[0,arr.length)之间

            // 交换元素(利用第三方临时变量)

            int temp = arr[i];
            arr[i] = arr[RandomIndex];
            arr[RandomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
