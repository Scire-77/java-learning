package com.javalearning.apidemo6;

public class Test1 {
    /*  String的其他常见方法:
            是否包含  contains
            判断开头、结尾  startsWith/endsWith
            查找  indexOf(int ch)  lastIndexOf(int ch)
            判断是否为空  isEmpty()
            转字符数组  toCharArray()
            大小写转换  toUpperCase()、toLowerCase()
            去除头尾空格  trim()
    * */
    public static void main(String[] args) {
        String str = "Hello World";

        // contains (小字符串是否包含在大字符串中, 必须是连续的 --- 敏感词过滤时可以用来判断)
        boolean b = str.contains("Hello");
        System.out.println(b);

        // startsWith/endsWith(可以用来判断文件后缀名)
        boolean b1 = str.startsWith("Hello");   // 用双参数版本, 第二个参数表示从指定索引开始查找
        boolean b2 = str.startsWith("World",6);
        System.out.println(b1 + " " + b2);

        boolean b3 = str.endsWith("World");
        System.out.println(b3);

        //indexOf(int ch) indexOf查找大串中某个小串第一次出现的位置, 注意使用的方法具体需要的参数类型;
        // lastIndexOf(int ch) lastIndexOf查找大串中某个小串最后一次出现的位置
        int i = str.indexOf(101);   // 101 --> e. 如果要查找的不存在, 索引值返回-1
        System.out.println(i);

        // isEmpty() 判断字符串有没有内容,长度是不是0 --- 登陆注册时, 判断用户名密码是否输入
        boolean b4 = str.isEmpty();
        System.out.println(b4);
        String str2 = "";
        boolean b5 = str2.isEmpty();
        System.out.println(b5);

        // toCharArray() 把字符串转换为字符数组 (应用: 想改变字符串的内容, 先转换成字符数组, 更改字符数组对应索引的字符, 然后再转回去)
        char[] chs = str.toCharArray();
        System.out.println(chs);    // println专门为 char[]设计的重载,直接遍历打印每个字符; 通用的Object重载是调用toString()得到地址

        // toUpperCase()、toLowerCase() 英文字符转换大小写
        String res = str.toUpperCase();
        System.out.println(res);
        System.out.println(str.toLowerCase());

        // trim() 去除字符串头尾空格 --- 登陆注册验证
        String str3 = "   hello world   ";
        String res2 = str3.trim();
        System.out.println(res2);
    }
}
