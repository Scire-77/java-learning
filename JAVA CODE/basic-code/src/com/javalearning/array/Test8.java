package com.javalearning.array;

public class Test8 {
    public static void main(String[] args) {
        // 合并有序数组:给定两个有序数组arr1 arr2,将两个数组合并到一个大数组中,要求合并之后大数组也是有序的
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;          // 利用双指针移动
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){      // 循环条件需要同时满足才进入循环,防止长短不一引起的小数组索引越界
            if(arr1[i] <= arr2[j]){     // 如果数组1的元素小于等于数组2
                arr3[k] = arr1[i];      // 把数组1的元素赋值给数组3
                i++;

            }else{      // 如果数组1的元素大于数组2
                arr3[k] = arr2[j];      // 把数组2的元素赋值给数组3(保持递增序列)
                j++;

            }
            k++;    // 无论什么判断条件,总要赋值给大数组.新的大数组索引总要+1
        }

        // 处理剩余元素(如果两个小数组不等长,在小数组遍历完成后,小数组对应的索引再加一就不满足以上&&条件)
        //  小数组在以上已遍历完成,此时他的索引等于对应数组长度.且已知给出的是递增序列.把长数组的剩余元素直接赋值给新的大数组即可
        while(i < arr1.length){     // 处理数组1中剩余的元素
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){     // 处理数组2中剩余的元素
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (int m = 0; m < arr3.length; m++) {
            System.out.println(arr3[m]);
        }
    }
}
