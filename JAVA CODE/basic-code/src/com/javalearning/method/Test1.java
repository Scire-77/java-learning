package com.javalearning.method;

import java.util.Scanner;

public class Test1 {
    /*评委打分: 五个评委打分,分数在0-100之间,最终得分会去掉最高和最低分后取平均值
        要求1:键盘录入五个整数存入数组中,如果超出范围得重新录入
        要求2: 定义方法分别求数组的最大值和最小值
        要求3: 计算五名评委的总分
        要求4: 总分-最大值-最小值,求最终平均分
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // 录入数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个评委的打分:");
            arr[i] = sc.nextInt();
            while(arr[i] < 0 || arr[i] > 100){      // 输入的分数有误,重新录入,利用while循环
                System.out.println("输入的分数有误,请重新输入:");
                arr[i] = sc.nextInt();
            }
        }

        // 调用方法求最大值和最小值
        int max = getMax(arr);
        int min = getMin(arr);

        // 获取数组的总分
        int sum = getSum(arr);

        // 获取数组的平均分
        double avg = getAvg(max,min,sum);

        System.out.println("最终得分为:" + avg);
    }

    // 定义方法求数组最大值
    public static int getMax(int[] arr){
        int max = arr[0];       // 需要额外定义max,直接用arr[0]会破坏原始数组数据:导致 getSum() 计算总分时使用的是被修改后的数组,而不是原始的五个评委分数。
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    // 定义方法求数组最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
               min=arr[i];
            }
        }
        return min;
    }

    // 获取数组的总分
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 获取数组的平均分
   public static double getAvg(int a , int b, int c){
        return (c-a-b)/3.0;
   }
}
