package com.javalearning.array;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        // 给定一个递增的有序数组和一个目标值,在数组中找到这个目标值,打印其索引.如果目标不在数组中,打印其应该插入的位置
        int[] arr = {1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {  // 直接遍历数组
            if(arr[i] == target){       // 如果数组元素等于目标值,打印索引
                System.out.println("索引为:" + i);
                count++;
                break;
            }else if(arr[i] > target){  // 遍历过程中找到第一次数组元素大于目标值的索引,那个元素的索引就是要插入的位置
                System.out.println("插入位置为:" + i);
                count++;
                break;
            }
        }

        if(count==0){   // 如果没有目标值且找不到数组元素比目标值大,说明目标值要插入到最后
            System.out.println("插入位置为:" + arr.length);
        }

    }
}
