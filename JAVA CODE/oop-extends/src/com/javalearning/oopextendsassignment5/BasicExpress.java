package com.javalearning.oopextendsassignment5;

public class BasicExpress {
    private String num;
    private int weight;
    private String receiver;

    public BasicExpress() {
    }

    public BasicExpress(String num, int weight, String receiver) {
        this.num = num;
        this.weight = weight;
        this.receiver = receiver;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getPrice(){
        return weight * 10;
    }
}
