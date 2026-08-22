package com.javalearning.apidemo3;

import java.util.Scanner;

public class Test1 {
    /*  遍历字符串
    需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

        public char charAt(int index)：根据索引返回字符
        public int length()：返回此字符串的长度
        数组的长度：数组名.length
        字符串的长度：字符串对象.length()
        需要注意的是数组中获取长度时length是数组的一个属性, 直接.length, 而字符串获取长度是调用的该类的方法.length()
    * */
    public static void main(String[] args) {
        // charAt示例:
        String str = "hello world";
        char c = str.charAt(0); // 注意charAt返回的是字符类型
        System.out.println(c);

        // length()示例
        int i = str.length();
        System.out.println(i);

        // 练习
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        // .next() 方法以空白字符（空格、Tab、换行）作为分隔符， .nextLine()，会读取一整行（包括空格），直到遇到换行符

        // 遍历字符串(快速生成:字符串.length().fori)
        for (int i1 = 0; i1 < s.length(); i1++) {
            char cc = s.charAt(i1);
            System.out.println(cc);
        }
    }
}
