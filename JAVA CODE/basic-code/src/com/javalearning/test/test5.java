package com.javalearning.test;

public class test5 {
    /*  接雨水:给定n个非负整数表示每个宽度为1的柱子的高度图,计算按此排列的柱子,下雨之后能接多少雨水
    *   输入height = [0,1,0,2,1,0,1,3,2,1,2,1]        输入的数组数据中的元素记录了柱子的高度
    *   输出6(即被柱子困住的雨水单位是6)
    *
    *   动态规划思想(DP):把大问题拆解成重叠的子问题，保存子问题答案，避免重复计算；同时满足最优子结构，从小最优推导出全局最优。
    *
    *   给定数组[1,0,1] -->能接到的雨水就是1单位;增加高度[1,0,2] --> 可接到的雨水仍然是1单位,左边会漏水不能困住雨水
    *   [2,0,2] --> 接到雨水2单位.   所以能否接到雨水看他两侧的柱子高度
    *   假设最右侧有无限高的柱子,左侧雨水流走一部分;(从左向右看)
    *   假设最左侧有无限高的柱子,右侧雨水流走一部分(从右向左看)
    *   流走的部分都不包括本身就能被柱子困住而接下的雨水
    *   那么取交集后的部分就是能接住的雨水; 要记录的是柱子+雨水的总高度
    *
    *   从左往右看: 定义一个第三方变量来记录目前最高的柱子高度,初始值0,从左往右遇到1则更新这个值,只有当遇到比这个值更大的数才更新,
    *               否则全部记录成1(即最左侧被这个高度1的柱子兜住了).此时[0,1,1,2----],遇到2了更新第三方变量,同时记录得到
    *               [0,1,1,2,2,2,2,3----](即从高度2的柱子开始,直到遇到更高的柱子,中间的雨水都被这个柱子困住了)
    *   从右往左看同理,取交集之后这记录的两个数组中相同索引对应的元素,谁小用谁的,目前还是柱子+雨水,下一步再把柱子的高度减去
    * */
    public static void main(String[] args) {
        // 定义数组
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        // 从左往右遍历数组
        int[] leftmax = new int[height.length];
        int temp = height[0];       // 定义第三方变量,默认最高柱子在0索引
        // 判断逻辑,记录数据
        for (int i = 0; i < height.length; i++) {
            if(temp > height[i]){
                leftmax[i] = temp;      // 如果变量记录的柱子高度大于原来数组元素,认为可以兜住,把变量记录柱子高度赋值给用于记录的数组中
            }else{
                leftmax[i] = height[i];     // 如果变量记录的高度不如原来的数组元素,认为这个变量高度不够,兜不住雨水,所以把原来数组的柱子高度放入用于记录的数组中
                temp = height[i];       // 更新变量记录的柱子高度
            }
        }

        // 输出检测
        for (int i = 0; i < leftmax.length; i++) {
            System.out.print(leftmax[i]+" ");
        }
        System.out.println(" ");

        // 从右往左遍历数组
        int[] rightmax = new int[height.length];
        temp = height[height.length-1];     // 从左向右遍历操作结束后,temp变量可以重新使用
        for (int i = height.length-1; i >= 0; i--) {
            if(temp > height[i]){   // 判断逻辑同理
                rightmax[i] = temp;
            }else{
                rightmax[i] = height[i];
                temp = height[i];
            }
        }

        // 输出检测
        for (int i = 0; i < rightmax.length; i++) {
            System.out.print(rightmax[i]+" ");
        }
        System.out.println(" ");

        // 取交集,对比从左往右和从右往左记录的数组,哪个小用哪个
        int[] result = new int[height.length];
        for (int i = 0; i < result.length; i++) {
            if(leftmax[i] < rightmax[i]){
                result[i] = leftmax[i];     // 可以在此优化,直接减去height[i]
            }else{
                result[i] = rightmax[i];
            }
        }

        // 减去原来的高度,输出结果
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i] - height[i];
        }
        System.out.println("总共接到的雨水是:"+sum);
    }
}
