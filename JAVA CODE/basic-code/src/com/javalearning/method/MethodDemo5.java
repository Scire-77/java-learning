package com.javalearning.method;

public class MethodDemo5 {
    // 给定两个长方形,判断哪个长方形面积更大
    /*
    *       定义方法: 1.考虑在大段代码中,反复使用的独立功能是什么(求面积)
    *                2. 这个独立功能需要什么参数(长宽)
    *                3. 方法的调用处,是否需要这个独立功能的结果继续做其他事情(后续需要进行比较,得有返回值)
    * */
    public static void main(String[] args) {
        double len1 = 10;
        double wid1 = 5;
        double len2 = 20;
        double wid2 = 10;

        double area1 = getArea(len1,wid1);
        double area2 = getArea(len2,wid2);
        if(area1 > area2){
            System.out.println("长方形1面积更大");
        }else if(area1<area2){
            System.out.println("长方形2面积更大");
        }else{
            System.out.println("两个长方形面积一样大");
        }
    }
    public static double getArea(double len,double wid){
        return len * wid;
    }
}
