package com.javalearning.test;

public class test1 {
    /*  移除元素:给定一个数组nums. 在数组中删除值为val的元素
    *   nums=[3,2,2,3], val=3
    *   nums=[2,2]
    * */
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,9};
        int val = 5;

        int slow = 0;
        int fast = 0;

        while (fast < nums.length){     // 快指针遍历
            if (nums[fast] != val){     // 不是给定的val, 则赋给慢指针
                nums[slow] = nums[fast];
                slow++;     // 慢指针自增
            }
            fast++;     // 快指针自增
        }

        // 输出slow指针存储的数组元素
       for(int i = 0; i < slow; i++){
           System.out.println(nums[i]);
       }
    }
}
