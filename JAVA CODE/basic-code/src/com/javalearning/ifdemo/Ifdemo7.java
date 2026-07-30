package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo7 {
    public static void main(String[] args) {
        // 判断坐标位置
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x坐标");
        int x = sc.nextInt();
        System.out.println("请输入y坐标");
        int y = sc.nextInt();

        if(x==0&&y==0){
            System.out.println("坐标在原点");
        }else if(x==0 && y!=0){
            System.out.println("坐标在y轴");
        }else if(x!=0 && y==0){
            System.out.println("坐标在x轴");
        }else if(x>0 && y>0){
            System.out.println("坐标在第一象限");
        }else if(x<0 && y>0){
            System.out.println("坐标在第二象限");
        }else if(x<0 && y<0){
            System.out.println("坐标在第三象限");
        }else{
            System.out.println("坐标在第四象限");
        }

    }
}
