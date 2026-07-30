package com.javalearning.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //大小写转换
       char ch = 'A';
       //A对应ASCII码65，计算时ch+32不是65+32，而是A的ASCII码+32，需要强制转换
       char CH = (char)(ch+32);
        System.out.println(CH);
    }
}
