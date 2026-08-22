package com.javalearning.apidemo3;


public class Test3 {
    /*  拼接字符串

    定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
    例如：
    数组为 int[] arr = {1,2,3};
    执行方法后的输出结果为：

    [1, 2, 3]
    * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String str = ArrayUtil.arrayToString(arr);    // 或者导包后写String str = arrayToString(arr);
        System.out.println(str);

        int[] arr2 = {1,3,5,7,8,90};
        String str2 = ArrayUtil.arrayToString(arr2);
        System.out.println(str2);

    }
}
