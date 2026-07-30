package com.javalearning.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
       double hp1=1012.5;
       double hp2 = 1223.3;
       double attack1 = 220;
       double attack2 = 210;
       double defense1 = 85;
       double defense2 = 80;
       double skill1=1.2;
       double skil2=1.3;
       double finalattack1 = attack1 * skill1 - defense2;
       double finalattack2 = attack2 * skil2 - defense1;
        System.out.println("我方进行第一次普通攻击，造成伤害："+(attack1 - defense2)+"对方还剩"+(hp2-attack1 + defense2));
        System.out.println("我方进行第二次技能攻击。造成伤害："+finalattack1+"对方还剩"+(hp2-finalattack1));
    }
}
