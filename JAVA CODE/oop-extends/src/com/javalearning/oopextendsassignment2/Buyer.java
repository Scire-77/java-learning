package com.javalearning.oopextendsassignment2;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("采购专员的工作是采购物品");
    }
}
