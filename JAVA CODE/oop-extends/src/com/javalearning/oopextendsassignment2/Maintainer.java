package com.javalearning.oopextendsassignment2;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("维护专员的工作是维护");
    }
}
