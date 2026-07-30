package com.javalearning.looploop;

public class LoopLoopDemo2 {
    //打印正三角形和倒三角形
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {      // 外循环控制行数
            for (int i = 1; i <= j; i++) {  // *由少到多,内循环初值由1开始,上限与外循环行数对齐
                System.out.print("*");
            }
            System.out.println();
        }



        for (int j = 1; j <= 5; j++) {
            for (int i = j; i <= 5; i++) {  // i = 1 2 3 4 5; *由多到少,内循环初值与外循环行数对齐,上限明确个数
                System.out.print("*");
            }
            System.out.println();
        }

   /*  for(int i = 5; i>=1; i--){
         for(int j = 0; j < i; j++){
             System.out.print("*");
         }
         System.out.println();
     }*/
    }
}
