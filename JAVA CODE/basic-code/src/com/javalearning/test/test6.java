package com.javalearning.test;

import java.util.Random;
import java.util.Scanner;

public class test6 {
    /*  大乐透: 前区5个数字,1-35; 后区2个数字,1-12; 要求同区不能重复,跨区可重复
    *   中奖规则: 一等奖: 5+2;     二等奖: 5+1;   三等奖: 5+0/4+2;  四等奖: 4+1/3+2;
    *           五等奖: 4+0/3+1/2+2;   六等奖: 3+0/1+2/2+1/0+2
    *   1. 利用Random生成号码 2. 利用Scanner接收输入 3.判断中奖
    * */
    public static void main(String[] args) {
        // 1.得到大乐透号码
        int[] lottery = getLottery();

        // 输出号码(复用,另写个方法)
        System.out.println("大乐透号码为:");
        printLettry(lottery);

        // 2.利用Scanner模拟购入彩票
        int[] buy = buyLottery();
        System.out.println("七注号码:");
        printLettry(buy);

        // 3.判断中奖(前区红球,后区蓝球),注意顺序不需要一一对应,只要判断是否存在即可
        checkLottery(buy,lottery);

    }

    // 3.判断中奖情况
    public static void checkLottery(int[] buy, int[] lottery){
        // 考虑到统计前区或者后区的中球个数是重复代码,仅参数不同,另开方法
        int count1 = getCount(buy,lottery,0,4);
        System.out.println("前区中奖个数为:" + count1);

        int count2 = getCount(buy,lottery,5,6);
        System.out.println("后区中奖个数为:" + count2);

        // 判断中奖情况
        if(count1 == 5 && count2 == 2){
            System.out.println("恭喜中奖,中奖类型:一等奖");
        }else if( count1 == 5 && count2 == 1){
            System.out.println("恭喜中奖,中奖类型:二等奖");
        }else if( (count1 == 5 && count2 == 0) || (count1 == 4 && count2 == 2)){
            System.out.println("恭喜中奖,中奖类型:三等奖");
        }else if( (count1 == 4 && count2 == 1) || (count1 == 3 && count2 == 2)){
            System.out.println("恭喜中奖,中奖类型:四等奖");
        }else if( (count1 == 4 && count2 == 0) || (count1 == 3 && count2 == 1) ||  (count1 == 2 && count2 == 2)){
            System.out.println("恭喜中奖,中奖类型:五等奖");
        }else if(  (count1 == 3 && count2 == 0) ||  (count1 == 1 && count2 == 2) ||  (count1 == 2 && count2 == 1) ||  (count1 == 0 && count2 == 2)){
            System.out.println("恭喜中奖,中奖类型:六等奖");
        }else{
            System.out.println("未中奖");
        }

    }

    // 2. 利用Scanner接收输入
    public static int[] buyLottery(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);

        // 买入前区号码
        System.out.println("请输入前五注号码:");
        for (int i = 0; i < 5;) {
            int num = sc.nextInt();
            // 判断范围
            if(num < 1 || num > 35){
                System.out.println("号码超出范围,请重新输入");
                continue;
            }

            // 判断唯一
            boolean flag = contains(num, arr, 0,i);
            if(flag){
                System.out.println("号码重复,请重新输入");
                continue;
            }

            // 当代码运行到此处,说明输入的数字已经满足了范围和唯一的要求
            arr[i] = num;
            i++;
        }

        // 买入后区号码
        System.out.println("请输入后两注号码:");
        for (int i = 0; i < 2;) {
            int num = sc.nextInt();
            // 验证范围
            if(num < 1 || num > 12){
                System.out.println("号码超出范围,请重新输入");
                continue;
            }
            // 判断唯一
            boolean flag = contains(num, arr, 5,6);
            if(flag){
                System.out.println("号码重复,请重新输入");
                continue;
            }

            // 当代码运行到此处,说明输入的数字已经满足了范围和唯一的要求
            arr[i+5] = num;
            i++;
        }
        return arr;
    }


    // 1.利用Random生成号码
    public static int[] getLottery(){
        int[] arr = new int[7];     // 定义大乐透号码数组
        Random random = new Random();

        //   前区号码生成
        for (int i = 0; i < 5; ) {
            int num = random.nextInt(1,36);
            //  判断是否重复(会复用,另写方法)
            boolean flag = contains(num, arr,0,4);
            if(!flag){
                arr[i] = num;
                i++;            // 只有判断不重复时,存入数字后索引才加1
            }
        }


        // 后区号码生成
        for(int i =0; i<2;){
            int num = random.nextInt(1,13);
            boolean flag = contains(num, arr,5,6);      // 后区判断重复时,原先的判断方法两个参数没法确定范围,需要添加范围参数,否则会覆盖前区号码
            if(!flag){
                arr[i+5] = num; // 赋值时做出+5的偏移(或定义循环范围时偏移)
                i++;            // 只有判断不重复时,存入数字后索引才加1
            }
        }

        return arr;
    }

    // 判断单区内号码是否重复
    public static boolean contains(int num, int[] arr, int start, int end){
        for (int i = start; i <= end; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;       // 只有循环结束,没有找到重复的,返回false
    }

    // 打印数组
    public static int[] printLettry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        return arr;
    }

    // 统计单区内的中奖情况(用start和end参数控制区域范围)
    public static int getCount(int[] buy, int[] lottery,int start, int end){
        int count = 0;
        for(int i = start; i <= end; i++){      // 注意判断方式,只要存在中奖号码就认为中奖,不考虑顺序
            boolean flag = contains(buy[i], lottery, start, end);
            if( flag){
                count++;
            }
        }
        return count;
    }
}


