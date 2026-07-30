package com.javalearning.controllerloop;

import java.util.Scanner;

public class ControllerLoopDemo2 {
        public static void main(String[] args) {

            //初始生命200，受到X伤害，回复Y血量。
            //且角色不会死，最低1血量；最大生命值上限200
            int hp = 200;
            Scanner sc = new Scanner(System.in);
            int X=0;
            while(true){
                System.out.println("请输入受到的伤害：");                // 利用无限循环+IF判断数值是否正确,break 跳出循环
                X = sc.nextInt();
                if(X>0){
                    break;
                }else {
                    System.out.println("请输入正确伤害值");
                }
            }

            hp -= X;

            if(hp < 1 ){
                hp = 1;
            }
            System.out.println("角色当前生命值为：" + hp);

            int Y=0;
            while( true){
                System.out.println("请输入回复的血量：");
                Y = sc.nextInt();
                if(Y>0){
                    break;
                }else{
                    System.out.println("请输入正确回复值");
                }
            }

            hp += Y;
            if(hp > 200){
                hp = 200;
            }
            System.out.println("角色当前生命值为：" + hp);
        }

}
