package com.javalearning.apidemo1;

public class Test1 {
    /*  1. String是Java定义好的一个类。定义在java.lang包中，使用的时候不需要导包。
        2. Java程序中的所有字符串文字（例如"abc"）都是此类的对象
        3. 字符串不可变，它们的值在创建后不能被更改

        创建方法:
    第一种：直接赋值
    第二种：new 关键字

    public String ()  空白字符串，不含任何内容
    public String (String original)  根据传入的字符串，创建新的字符串对象
    public String (char [] chs)  根据字符数组，创建字符串对象
    public String (byte [] chs)  根据字节数组，创建字符串对象

    * */
    public static void main(String[] args) {
        // 直接赋值(代码简单,节约内存,串池复用)
        String s = "abc";
        System.out.println(s);

        //new + 构造方法(每次创建都会创建一个新的字符串对象)
        // 空参构造
        String s1 = new String();
        System.out.println("---"+s1+"@@@"); // 创建了一个没有内容的字符串对象

        // 有参构造(传入字符串)
        String s2 = new String(s);
        System.out.println(s2);

        // 有参构造(传入字符数组)
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3); // 生成abc字符串

        // 有参构造(传入字节数组)
        byte[] bytes = {97, 98, 99};
        String s4 = new String(bytes);
        System.out.println(s4); // 生成abc字符串(ASCII码表)

    }
}
