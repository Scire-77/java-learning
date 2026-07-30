package com.javalearning.looploop;

public class Test1 {
    //打印平行四边形
    /*
    *           ##******
    *           #******#
    *           ******##
    * */
    public static void main(String[] args) {
        //方法1:能够看出规律

        for(int i=1;i<=3;i++){
            for(int j=i;j<=2;j++){  // 打印左上角空格
                System.out.print(" ");
            }
            for(int j=1;j<=6;j++){  // 打印*,每行都是六个
                System.out.print("*");
            }
            System.out.println(); //     换行,右下角的空格不用管
        }

        System.out.println();
        // 方法2:看不出规律,把图形分块
        for(int i = 1 ; i <= 3; i++){
            for(int j =i; j<=2; j++){   // 打印左上角空格
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){ // 空格对应的下方的小三角
                System.out.print("*");
            }
            for(int j = 1 ; j<=3;j++){ // 中间的正方形
                System.out.print("*");
            }
            for(int j =i; j<=2; j++){ // 正方形右上方的小三角
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
