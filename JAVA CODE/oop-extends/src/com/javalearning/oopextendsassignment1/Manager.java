package com.javalearning.oopextendsassignment1;

public class Manager extends Person {
    private int bonus;

    // 无参构造函数
    public Manager() {

    }

    // 有参构造函数
    public Manager(int num, String name, int salary, int bonus) {
        super(num, name, salary);
        this.bonus = bonus;
    }

    // get/set
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // 行为

    @Override
    public void work() {
        System.out.println("经理的工作是管理其他人");
    }


}
