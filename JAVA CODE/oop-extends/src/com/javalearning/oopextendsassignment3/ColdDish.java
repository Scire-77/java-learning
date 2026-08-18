package com.javalearning.oopextendsassignment3;

public class ColdDish extends Dish {
    private int shelfLife;

    public ColdDish() {

    }

    public ColdDish(String name, Double price, String flavour, int shelfLife) {
        super(name, price, flavour,"凉菜");
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    // 行为

    @Override
    public void intro() {
        super.intro();
        System.out.println("保质期:" + shelfLife + "分钟, " + getDiner());
    }
}
