package com.javalearning.test;

public class test3 {
    /*  二路归并找中位数:给定两个正序数组,先合并数组,并找到合并之后数组的中位数
    * */
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // 循环合并数组,结束条件为&&,即一个数组遍历完成
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // 处理原来的数组的剩余元素
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("合并后的数组为:");
        for (int m = 0; m < arr3.length; m++) {
            System.out.print(arr3[m]+" ");
        }
        System.out.println(" ");
        System.out.println("中位数为:");
        if(arr3.length % 2 == 0){
            int num1 = arr3[arr3.length/2];
            int num2 = arr3[arr3.length/2 - 1];
            System.out.println((num1 + num2)/2.0);      // 注意一下返回值类型
        }else{
            System.out.println(arr3[arr3.length/2]);
        }
    }
}
