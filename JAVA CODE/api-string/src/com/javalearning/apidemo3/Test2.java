package com.javalearning.apidemo3;

import java.util.Scanner;

public class Test2 {
    /*  统计字符次数

        键盘录入一个字符串，统计该字符串中大写字母字符(65 ~ 90)，小写字母字符(97 ~ 122)，数字字符(48 ~ 57)出现的次数
        (不考虑其他字符)
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)  // 判断条件也可以写>='A'&&<='Z',只是char 与 int 比较，char 会被自动提升为 int
                upperCaseCount++;
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                lowerCaseCount++;
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                digitCount++;
        }
        System.out.println("大写字母出现的次数为：" + upperCaseCount);
        System.out.println("小写字母出现的次数为：" + lowerCaseCount);
        System.out.println("数字出现的次数为：" + digitCount);
    }
}
