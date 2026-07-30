package com.javalearning.loopfor;

public class ForDemo3 {
    public static void main(String[] args) {
        /*
        *   一组数字,第三项开始每一项都是前两项的和,求第10项数字是多少
        * 0,1,1,2,3,5,8,13,21,34,55,89...
        * a,b,c
        *   a,b,c
        * 0,1,2,3,4,5,6,7,8,9,10
        *
        * */

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 3; i<=10; i++){
            c = a + b;
            a=b;
            b=c;
        }
        System.out.println( c);
    }
}
