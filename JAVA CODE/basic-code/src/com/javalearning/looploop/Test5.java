package com.javalearning.looploop;

public class Test5 {
    // 打印九九乘法表
    public static void main(String[] args) {
        // 外循环行数
        for(int i = 1; i <= 9; i++){
            for(int j =1; j<=i; j++){   // 内循环列数,i和j能满足乘法表内1-9数据的需要
                System.out.print(j+"*"+i+"="+i*j+"\t");     // 打印时想要调换1*9数字的位置,只需要调换j和i的位置即可
            }
            System.out.println();
        }
    }
}
/*    "\t" 其中的\t是制表符,能够使得数字对齐
*       简单理解:长度可变的大空格.打印表格类型数据时,可以让其上下对齐    */

