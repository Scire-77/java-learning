package com.javalearning.oopextendsassignment1;

public class Cook extends Person {
    // 无参构造函数
    public Cook() {
    }

    // 有参构造函数
    public Cook(int num, String name, int salary) {
        super(num, name, salary);
    }

    // 行为


    @Override
    public void work() {
        System.out.println("厨师的工作是炒菜");
    }


}
