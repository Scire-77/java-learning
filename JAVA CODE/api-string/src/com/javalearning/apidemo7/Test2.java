package com.javalearning.apidemo7;

public class Test2 {
    /*   StringBuilder
            StringBuilder是字符串的一个工具类，可以让我们拼接字符串的时候效率更高
            多个字符串+=拼接时会产生很多冗余的中间数据,浪费内存; StringBuilder可以看作一个容器,每次把要拼接的内容放到容器中

         构造方法:
            public StringBuilder()                创建StringBuilder容器，不含有任何内容
            public StringBuilder(String str)      创建StringBuilder容器，包含指定的内容

        常用方法:
            StringBuilder append(任意类型)	添加数据
            StringBuilder reverse()	        反转容器中的内容
            int length()	                返回长度（字符的个数）
            String toString()	            转回String字符串对象
    * */
    public static void main(String[] args) {
        // 用StringBuilder拼接字符串效率更高, 示例:
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        // 带参构造
        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("aaa");
        sb2.reverse();
        // sb2 永远是 StringBuilder 类型，toString() 只是返回一个新的 String，不改变 sb2 自身
        String str = sb2.toString();
        // 直接 println(sb2) 也能输出内容，是因为 StringBuilder 重写了 toString()
        System.out.println(str);
        System.out.println(sb2.length());
    }
}
