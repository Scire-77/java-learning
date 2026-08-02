package com.javalearning.array;

public class Test7 {
    public static void main(String[] args) {
        // 给定一个整数数组nums.和整数目标值target.在数组中找出和为目标的值的数对。并输出他们的索引
        // 不考虑效率问题,两层循环解决
        // 要求1 只要输出第一对满足要求的情况   要求2 输出所有满足条件的情况
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {   // 从i+1个索引的元素开始遍历,不会出现(0,6)和(6,0)的重复情况
                if(nums[i] + nums[j] == target){
                    System.out.print("索引为:" + i + " " + j);
                }
            }
        }

        /*int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {   // j=i+1,从第i个索引的下一个元素开始遍历
                if(nums[i] + nums[j] == target){
                    System.out.print("索引为:" + i + " " + j);
                    count++;
                   break;   // 找到第一个数值对后直接break出内循环
                }
            }
            if(count > 0){
                break; // 找到第一个数值对后直接break出外循环
            }
        }*/
    }
}
