package com.javalearning.apidemo4;

public class Test1 {
    /*  数据脱敏:
            - String substring(int beginIndex, int endIndex)  截取指定范围
            注意点：包头不包尾，包左不包右
            只有返回值才是截取的小串(对调用者字符串不产生影响, 不要忘记字符串本身创建后无法改变)

            - String substring(int beginIndex)    截取到末尾

            需求：只保留用户名的第一个字符，后面用三个***替代
    * */
    public static void main(String[] args) {
        // substring示例
        String str = "hello world";
        String subStr = str.substring(0, 5);
        System.out.println(subStr);

        // 需求实现
        // charAt(0)实现
        String username = "zhangsan";
        char firstChar = username.charAt(0);
        String encryption = firstChar + "***";
        System.out.println(encryption);

        // substring实现(注意返回值类型不同于charAt)
        String firstString = username.substring(0, 1);
        System.out.println(firstString + "***");
    }
}
