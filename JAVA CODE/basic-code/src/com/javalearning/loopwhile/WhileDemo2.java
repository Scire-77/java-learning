package com.javalearning.loopwhile;

public class WhileDemo2 {
    //折叠纸张,珠峰8848.86M=8848860mm,一张纸厚度0.11,折叠几次能到达珠峰的高度
    public static void main(String[] args) {
        double h1=8848860;
        int count = 0;
        double h0=0.1;
        while(h1>h0){
            h0 *= 2;
            count++;
        }
        System.out.println(count);

    }
}
