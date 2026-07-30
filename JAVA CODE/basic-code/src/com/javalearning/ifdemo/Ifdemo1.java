package com.javalearning.ifdemo;

import java.util.Scanner;

public class Ifdemo1 {
    public static void main(String[] args) {

        //初始生命200，受到X伤害，回复Y血量。
        //且角色不会死，最低1血量；最大生命值上限200

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受到的伤害：");
        int X = sc.nextInt();
        System.out.println("请输入回复的血量：");
        int Y = sc.nextInt();

        int hp = 200;

        hp -= X;
        if(hp < 1 ){
            hp = 1;
        }

        hp += Y;
        if(hp > 200){
            hp = 200;
        }
        System.out.println("角色当前生命值为：" + hp);
    }
}
