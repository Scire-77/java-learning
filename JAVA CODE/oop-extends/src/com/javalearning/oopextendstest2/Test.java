package com.javalearning.oopextendstest2;

public class Test {
    /*  现在有三个电子设备，请设计他们的继承结构
            安卓手机：
            　属性：品牌，价格，
            　行为：打电话，发短信，nfc 功能
            苹果手机：
            　属性：品牌，价格
            　行为：打电话，发短信
            笔记本电脑：
            　属性：品牌，价格
            　行为：编程

                                    电子设备
                                   /        \
                                 手机     笔记本电脑
                                /    \
                            安卓手机 苹果手机
                            (层次图考虑时从下往上考虑, 抽取共性内容不断向上,写代码时从上往下写)

        继承的特点: JAVA只支持单继承, 不支持多继承, 但支持多层继承
                        在多层继承中分为直接父类和间接父类.
                    顶级父类Object: 虚拟机自动加的父类, 每一个类都直接或间接继承于Object
    * */
    public static void main(String[] args) {
        Android android = new Android();
        android.brand = "HUAWEI";
        android.price = 10000;
        System.out.println("Brand: " + android.brand + ", Price: " + android.price);
        android.call();
        android.sendSMS();
        android.nfc();

        //注意继承层次, Phone也要继承自SmartDevice, 否则.brand/price报错; 对于Android, Phone是直接父类, SmartDevice是间接父类

        IOS ios = new IOS();
        ios.brand = "APPLE";
        ios.price = 20000;
        System.out.println("Brand: " + ios.brand + ", Price: " + ios.price);
        ios.call();
        ios.sendSMS();

        Laptop laptop = new Laptop();
        laptop.brand = "DELL";
        laptop.price = 30000;
        System.out.println("Brand: " + laptop.brand + ", Price: " + laptop.price);
        laptop.coding();


    }
}
