package com.javalearning.test;

import java.util.Random;

public class test4 {
    /*  统计个数:五个候选人,有1000人参与投票(一人一票, 可以弃权,或者选1-5号)
    *   投票使用Random模拟,0表示弃权
    *   要求1: 统计每个候选人的得票数和得票率,找出得到票数最多的人
    *   要求2: 统计其弃票数和弃票率*/
    // (用数组统计,不使用count++)
    public static void main(String[] args) {
        int[] arr = new int[6];     // 创建一个长度为6的数组,下标为1-5,0表示弃权
        Random random = new Random();

        // 模拟投票,统计数量
        for (int i = 0; i < 1000; i++) {
            int vote = random.nextInt(6);       // 随机数范围[0,6)
            arr[vote]++;    // vote即表示数组索引,也能对应上候选人与弃票的需求.数组中的元素即是票数
        }

        // 输出每个人的得票信息
        for (int i = 1; i < arr.length; i++) {      // 注意起始条件1,不统计弃票
            System.out.println("第" + i + "个候选人的票数为:" + arr[i]);
            System.out.println("其得票率为:" + arr[i]/1000.0*100+"%");   // 注意数据类型转换
        }

        // 找出票数最多的数目
        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {  // 遍历寻找最大值,注意初始值从arr[1]开始,所以起始条件2
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("票数最多为:" + max);

        // 找到票数最多的人(注意会出现票数相等的情况,全部打印出来即可)
        for (int i = 1; i < arr.length; i++) {
            if(max == arr[i]){
                System.out.println("第" + i + "个候选人的票数最多,"+ "票数为:" + max);
            }
        }

        // 统计弃票信息
        System.out.println("弃票数:" + arr[0]);
        System.out.println("弃票率为:" + arr[0]/1000.0*100+"%");
    }
}
