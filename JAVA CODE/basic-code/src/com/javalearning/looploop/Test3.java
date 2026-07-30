package com.javalearning.looploop;

public class Test3 {
    /*打印菱形
    *           ###*###
    *           ##***##
    *           #*****#
    *           *******
    *           #*****#
    *           ##***##
    *           ###*###
    * */
    public static void main(String[] args) {
        // 菱形上半部分:
        for(int i =1; i<=4;i++){
            for(int j =i;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){      // 方法1:输出1\3\5\7个*
                System.out.print("*");
            }
            System.out.println();
        }

        // 菱形下半部分:
        for(int i=1;i<=3;i++){
            for(int j =1; j<=i; j++){   // 方法2:分割图形生成
                System.out.print(" ");
            }
            for(int j=i;j<=2;j++){
                System.out.print("*");
            }
            System.out.print("*");
            for(int j =i;j<=2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
