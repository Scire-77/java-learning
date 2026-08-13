package com.javalearning.toolclasstest;

public class ArrayUtil {
    /*  工具类:    不是用来描述事物的(Javebean类), 也没有main方法, 而是帮忙做一些事情的类
        1.类名见名知意: Util一般是工具类的习惯后缀
        2. 私有化构造方法: 工具类不是描述事物的, 所以创建其对象是无意义的, 那么可以私有化构造方法 让外界没法创建对象
        3. 方法定义为静态的static, 直接用类名调用即可
    * */

    // 私有化构造方法
    private ArrayUtil(){

    }

    // 定义方法(静态)
    public static String printArray(int[] arr){
                    /*  直接打印遍历
                    System.out.print("[");
                    for (int i = 0; i < arr.length; i++) {
                        if(i == arr.length - 1){
                            System.out.print(arr[i] + "]");
                        }else{
                            System.out.print(arr[i] + ", ");
                        }
                    }*/

        // 使用字符串拼接的方式
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                result += arr[i] + "]";
            }else{
                result += arr[i] + ", ";
            }
        }
        return result;
    }

    // 求平均数
    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum *1.0 / arr.length;       // 注意数据类型
    }


}
