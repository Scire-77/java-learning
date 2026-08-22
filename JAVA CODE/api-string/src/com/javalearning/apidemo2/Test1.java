package com.javalearning.apidemo2;

import java.util.Scanner;

public class Test1 {
    /*  字符串的比较:
        ==: 对于  基本数据类型  比较的是  值
        ==: 对于  引用数据类型  比较的是  地址
        boolean equals方法(要比较的字符串): 比较的是内容, 完全一样的结果返回True
        boolean equalsIgnoreCase方法(要比较的字符串): 忽略大小写的比较

        练习：
        已知正确的用户名和密码，请用程序实现模拟用户登录
        总共给三次机会，登录之后，给出相应的提示
    * */
    public static void main(String[] args) {
        /* equals方法举例:
        String s1 = "abc";
        String s2 = "abc";

        boolean b1 = s1.equals(s2);
        System.out.println(b1);*/

        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("请输入用户名：");
            String username = sc.next();

            System.out.println("请输入密码：");
            String password = sc.next();

            boolean result = rightUsername.equals(username) && rightPassword.equals(password);
            if(result){
                System.out.println("登录成功！");
                break;
            }else{
                if(i<2){
                    System.out.println("登录失败，请重新输入！还剩" + (2-i) + "次机会");
                }else{
                    System.out.println("登录失败，账号" + username + "已锁定，请联系管理员");
                }   // 暂时无法解决的BUG: 提示锁定的账号只是最后一次输入的, 不一定是同一账号连续输入三次
            }
        }
    }
}
