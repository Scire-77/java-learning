package com.javalearning.array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        // 获取10个1-100之间的随机数,存入数组中,要求数据唯一
        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {     // 注意i++位置
            int num = r.nextInt(100) + 1;
            // 继续判断,如果不存在就添加,如果存在就舍弃不管
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    count++;
                    break; // 跳出内循环
                }
            }
            if(count == 0){         // 确定数字唯一,把随机数放入数组中
                arr[i] = num;
                i++;        // 只有生成一个满足要求的随机数,i 才加1.; 否则如果出现了重复数字,不会执行if语句,没有给目前i索引赋值--
                            //  再次执行i++就进入了下一个元素的位置, 导致数据丢失被默认赋值成0
            }
        }
        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
