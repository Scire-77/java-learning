package com.javalearning.loopfor;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("1-100的偶数和是:"+ sum);
    }
}
