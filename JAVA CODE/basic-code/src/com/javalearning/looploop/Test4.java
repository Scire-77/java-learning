package com.javalearning.looploop;

public class Test4 {
    /*  空心菱形
*                                   ##*##
*                                   #*#*#
*                                   *###*
*                                   #*#*#
*                                   ##*##
    * */
    public static void main(String[] args) {
        // 菱形上半部分:
        for(int i =1; i<=3;i++){
            for(int j=i;j<=2;j++){  // 左上角空白部分
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){  // 填充*和#;(首尾打印,其余填充)
                if(j==1 || j==2*i-1){       /* 外层i=1时. j<=1; 只执行一次,输出*在第一行; 外层i=2时,j<=3,输出3个字符,首尾是*,中间填充*/
                    System.out.print("*");  // 此时执行第一次内循环,打印*,执行第二次内循环,打印空格,执行第三次内循环,打印*;
                }else{                      //同理,当外层i=3,j<=5(打印5个字符),只有第一次和第五次内循环打印*,其他填充
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 菱形下半部分:
        for(int i=2;i>=1;i--){          // 逻辑原理同上,对称
            for(int j=i; j<=2; j++){    // 打印空白字符填充,外循环采用递减,for内部分同上即可满足需求
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){  // 外层i=2时,j<=3(即第四层打印三个字符)
                if(j == 1 || j == 2*i - 1){     // 只有第一次和第三次打印*
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
