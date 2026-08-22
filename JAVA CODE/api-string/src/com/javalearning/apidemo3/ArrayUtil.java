package com.javalearning.apidemo3;

public class ArrayUtil {
    private ArrayUtil(){};  // 私有化构造方法, 不让外部创建对象

    public static String arrayToString(int[] arr){
        String str ="[";     // 不知道赋值什么的时候,可以定义一个空字符串(""长度为0)

        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str +=  arr[i] + "]";
            }else{
                str +=  arr[i] + ", ";
            }
        }
        return str;
    }
}
