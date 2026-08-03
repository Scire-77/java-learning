package com.javalearning.method;

public class MethodDemo6 {
    /*          方法重载
    *   1. 同一个类中,定义了多个同名方法,这些方法功能类似
    *   2. 每个方法有不同的参数类型和个数,这些同名的方法就构成重载关系
    *   3. 简单理解: 同一个类,方法名相同,参数不同(个数,类型,顺序)的方法,无需看返回值.
    * */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));
    }

    public static double getSum(int a,int b){     // 优先调用参数格式一一对应的方法
        return a+b;
    }

    public static double getSum(int a,double b){    // 如果第一个方法被注释掉,此时会报错,第二个和第三个都有一个隐式转换
        return a+b;
    }
    public  static double getSum(double a ,int b){  // 此时编译器无法确定哪个优先级更高,所以方法重载一般不写参数顺序不同的方法
        return a+b;
    }
    public static double getSum(double a,double b){     // 以上方法全部注释掉该方法也可以使用,因为可以进行隐式转换
        return a+b;
    }
}
