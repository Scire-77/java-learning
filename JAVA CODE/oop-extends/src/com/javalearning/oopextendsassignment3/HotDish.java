package com.javalearning.oopextendsassignment3;

public class HotDish extends Dish {
    private int cookTime;

    // Default constructor
    public HotDish() {

    }

    // Parameterized constructor
    public HotDish(String name, Double price, String flavour, int cookTime) {
        super(name, price, flavour,"热菜");
        this.cookTime = cookTime;
    }

    // get/set

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    // 行为
    /*
        ==	对象地址	判断是否为同一个字符串对象（极少用）
        equals()	字符内容	判断字符串内容是否相等（日常业务首选）
    * */
    @Override
    public void intro() {
        super.intro();
        System.out.println("烹饪时间:" + cookTime + "分钟, " + getDiner());
    }
}
