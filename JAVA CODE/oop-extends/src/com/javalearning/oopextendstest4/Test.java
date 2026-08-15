package com.javalearning.oopextendstest4;

public class Test {
    /*  继承中方法的书写与调用规则和变量基本一致;
    *   额外多一点: 方法的重写: 在子类中,把父类的方法再写一遍, 方法申明保持一致(名字/修饰符/参数列表等)
    *               作用: 父类的方法不能满足需求了, 需要用到方法重写
    *
                 第一代手机：
                　功能：打电话

                第二代手机：
                　功能：打电话，发短信

                第三代手机：
                　功能：打电话升级为视频通话(需要重写)，发短信，玩游戏
    * */
    public static void main(String[] args) {
        FirstGeneration f = new FirstGeneration();
        f.call();

        System.out.println("-------------------");

        SecondGeneration s = new SecondGeneration();
        s.call();
        s.sendSMS();

        System.out.println("-------------------");

        ThirdGeneration t = new ThirdGeneration();
        t.call();       // 注意这个被重写的方法@Override
        t.sendSMS();
        t.playGame();
    }
}
