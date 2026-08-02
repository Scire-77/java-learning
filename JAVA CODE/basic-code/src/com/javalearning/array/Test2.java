package com.javalearning.array;

public class Test2 {
    public static void main(String[] args) {
        // 找出数组最大值并打印
        int[] arr  = {33,5,22,44,55};
                                                            // int max = arr[0] ;(初值不要赋0,因为可能会有负数在数组内)
        for (int i = 0; i < arr.length; i++) {              // i = 0;对于结果没有影响.只是多判断一次效率变低
            if(arr[0]<arr[i]){                          //if (max < arr[i]){max = arr[i];}
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
}
