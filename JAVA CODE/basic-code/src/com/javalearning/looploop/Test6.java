package com.javalearning.looploop;

public class Test6 {
    public static void main(String[] args) {
        // 制表符使用:
        /*  真正的含义:在前面的字符后面补上1-4(或8,部分编译器)个空格,让整体的长度凑成四的(或八的)整数倍

        *   name     age  gender
        *   zhangsan 18   male
        *   lisi   19   female
        * */


        System.out.println("name\t\tage\tgender");
        System.out.println("zhangsan\t18\tmale");       // zhangsan比较长,一个\t之后还没对齐,再补\t
        System.out.println("lisi\t\t19\tfemale");
    }
}
