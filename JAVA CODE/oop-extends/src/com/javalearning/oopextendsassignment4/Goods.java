package com.javalearning.oopextendsassignment4;

public class Goods {
    private String name;
    private  int price;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.print("Name: " + name + ", Price: " + price + ", ");
    }
}
