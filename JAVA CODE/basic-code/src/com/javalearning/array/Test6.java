package com.javalearning.array;

public class Test6 {
    public static void main(String[] args) {
        // 给定义一个递增有序数组,去除重复元素
        // 快慢指针: 慢指针表示存入的位置,快指针用来找不重复的数据
        // 如果快慢指针的数值相等-->舍弃快指针位置的数据; 如果数值不相等-->快指针的数据存入慢指针位置

        int[] arr ={1,1,2,2,2,2,3,3,3,3};
        // 定义两个指针(两个变量,不同于C语言指针)
        int slow = 0;
        int fast = 1;

        while(fast < arr.length){   // 当快指针遍历完成后才终止
            if(arr[slow] != arr[fast]){     //如果不相等
                slow++;             // 慢指针先自增
                arr[slow] = arr[fast];      // 再把快指针的数值赋值给慢指针的位置
            }
            fast++; // 快指针在判断完之后都要自增
        }
                                /*
                                * while(fast < arr.length){
                                * if(arr[slow] == arr[fast]){   // 如果相等
                                *   fast++; // 快指针自增
                                * }else{        // 不相等
                                *   slow++;     // 慢指针先自增
                                *   arr[slow] = arr[fast];  // 把快指针的数值赋值给慢指针的位置
                                *   fast++; }// 快指针再自增
                                * }
                                * */
        for (int i = 0; i <= slow; i++) {   // 循环终止到慢指针的位置
            System.out.println(arr[i]);
        }
    }
}
