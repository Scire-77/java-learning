package com.javalearning.method;

import java.util.Scanner;

public class Test2 {
    /*  计算分数:需要统计十个人的分数(0-100),计算及格率,平均分,并找出最高分
    *要求1: 键盘录入十个分数,存入数组.超出范围提示无效并重新录入
    * 2.定义方法,求及格人数,根据及格人数求及格率
    * 3.定义方法求总分,根据总分求平均分
    * 4.定义方法求最大值
    * */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        // 录入数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生的分数:");
             arr[i] = sc.nextInt();
            while(arr[i]<0||arr[i]>100){
                System.out.println("输入的分数有误,请重新输入:");
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("及格率:" + getRate(arr));
        System.out.println("平均分:" + getAvg(arr));
        System.out.println("最高分:" + getMax(arr));

    }

    // 求及格人数和及格率
    public static double getRate(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=60){
                count++;
            }
        }
        return (double) count /arr.length;
    }

    // 求总分和平均分
    public static double getAvg(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    // 求最大值
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
