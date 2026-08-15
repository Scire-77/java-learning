package com.javalearning.oopextendstest4;

public class ThirdGeneration extends SecondGeneration {
    // @Override是注解, 注解/注释都是对代码的解释说明
    // 注解是注解给虚拟机看的,@Override表示对父类方法的重写(快捷键alt+insert)

    @Override
    public void call() {
        System.out.println("视频通话");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}
