package com.javalearning.test1;

public class Test {
    /*# 编写带有接口和抽象类的标准 Javabean 类

        青蛙 属性：名字，颜色   行为：吃虫子，蛙泳
        狗 属性：名字，颜色     行为：吃骨头，狗刨
        兔子 属性：名字，颜色   行为：吃胡萝卜
    * */

    public static void main(String[] args) {
        Frog frog = new Frog("青蛙", "绿色");
        frog.eat();
        frog.swim();

        Dog dog = new Dog("狗", "棕色");
        dog.eat();
        dog.swim();

        Rabbit rabbit = new Rabbit("兔子", "白色");
        rabbit.eat();

    }
}
