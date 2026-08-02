package com.javalearning.array;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // 获取10个0-100之间的随机数,存入数组中,要求数据唯一
        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(101) ;  // 范围设定成[0,101)

            int count = 0;

            for (int j = 0; j < i; j++) {       // 关键修改处,内循环遍历条件为j<i,也就是只判断了已经填充元素的部分
                if(arr[j] == num){              // 对于还没填充,默认赋值0的数字,不会被判断为重复.否则随机数0无法填入数组内
                    count++;
                    break; // 跳出内循环
                }
            }
            if(count == 0){         // 确定数字唯一,把随机数放入数组中
                arr[i] = num;
                i++;
            }
        }
        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
