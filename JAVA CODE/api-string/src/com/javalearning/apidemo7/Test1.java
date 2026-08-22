package com.javalearning.apidemo7;

public class Test1 {
    /*  StringBuilder拼接字符串
    * */
    public static void main(String[] args) {

        // 统计时间的方法(记录开始时间)
        long startTime = System.currentTimeMillis();

        // 传统遍历拼接
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "abc";
        }
        System.out.println(str);

        // 统计时间的方法(记录结束时间)
        long endTime = System.currentTimeMillis();
        System.out.println("传统遍历拼接字符串耗时：" + (endTime - startTime) + "ms");  // 1s = 1000ms
    }
}
