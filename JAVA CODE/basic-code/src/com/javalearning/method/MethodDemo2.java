package com.javalearning.method;

import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 获取10个1-100之间的随机数,存入数组中,要求数据唯一(使用方法改写)
        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {     // 注意i++位置
            int num = r.nextInt(100) + 1;

            // 继续判断,如果不存在就添加,如果存在就舍弃不管
            boolean notunique = ifcontains(num, arr);

            if(!notunique){         // 当ifcontains返回true,说明有重复,进行取反,也就是返回false才进行赋值
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

    public static boolean ifcontains(int num, int[] arr){
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == num){
                //  如果数组中存在num,返回true;return语句会直接结束方法,不会再次循环
                return true;    // 如果有重复,返回true;
            }
        }
        // 循环遍历结束后,说明数组中不存在num,返回false
        return false;
    }
}
