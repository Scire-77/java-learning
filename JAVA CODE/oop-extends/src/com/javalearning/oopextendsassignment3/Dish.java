package com.javalearning.oopextendsassignment3;

import java.lang.reflect.Type;

public class Dish {
    private String name;
    private Double price;
    private String flavour;
    private String type;

    // Constructor
    public Dish() {
    }

    public Dish(String name, Double price, String flavour, String type) {
        this.name = name;
        this.price = price;
        this.flavour = flavour;
        this.type = type;
    }

    // get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // 行为
    public void intro(){
        System.out.print(type + name + ", 价格" + price + "元," + "口味" + flavour + ", ");
    }

    public String getDiner(){
        if(flavour.equals("麻辣"))
            return "适合重口味食客";
        else
            return "适合所有食客";
    }
}
