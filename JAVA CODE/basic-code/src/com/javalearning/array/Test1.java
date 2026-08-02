package com.javalearning.array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入,查找是否在数组中存在,出现多次则返回第一次的索引即可,存在则打印索引
        int[] arr ={33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素:");
        int num = sc.nextInt();

        boolean flag = false;   // int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println("元素存在,索引为:" + i);
                flag = true;        // count++
                break;
            }
        }
        // 判断元素不存在必须把所有元素遍历完之后才能判断,所以写在循环之外
        if(!flag){          // if(count==0)
            System.out.println("元素不存在");
        }
    }
}
