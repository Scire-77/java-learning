package com.javalearning.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        // 调用方法打印乘法表
        printTable();
    }

    // 空白参数的方法,调用时实参也空着
    // 且void类型方法没有返回值,return可以省略,如果不省略的话后面不写具体数值,仅表示结束方法
    public  static  void printTable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
