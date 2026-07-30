package com.javalearning.looploop;

public class Test2 {
    /* 打印梯形
    *           ##***##
    *           #*****#
    *           *******
    * */
    public static void main(String[] args) {
        for(int i =1; i<=3;i++){
            for(int j = i;j<=2;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i+1; j++){    // 应该用外层的行号 i 来计算每行的星号数量，而非内层循环变量 j。
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
