package com.javalearning.looploop;

public class LoopLoopDemo1 {
    public static void main(String[] args) {
        //打印四行五列*
        // 在一行去打印5个
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();       //打印完一行后,换行
        }

      /*  for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("*");    // println()方法会自动换行,先打印,后换行
            }
        }
*/
    }
}
