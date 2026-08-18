package com.javalearning.test4;

        /*   抽象方法
            public abstract 返回值类型 方法名(参数列表);

            抽象类
            public abstract class 类名{...}
* */
public abstract class Animals {     // 注意使用抽象方法后, 类必须声明为抽象类
    String name;
    String color;

    public Animals() {
    }

    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 行为吃可以抽取共性到父类中, 但具体内容由子类实现, 所以可以抽象方法
    public abstract void eat();

    public void drink(){
        System.out.println("喝水中");
    }
}
