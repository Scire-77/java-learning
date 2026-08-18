package com.javalearning.oopextendsassignment4;

public class Electronics extends Goods {
    private String brand;
    private String model;

    public Electronics() {

    }

    public Electronics(String name, int price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
