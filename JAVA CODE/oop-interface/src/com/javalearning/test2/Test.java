package com.javalearning.test2;

public class Test {
    /*  # 编写带有接口和抽象类的标准Javabean类

        乒乓球运动员：姓名，年龄，学打乒乓球，说英语
        篮球运动员：姓名，年龄，学打篮球
        乒乓球教练：姓名，年龄，教打乒乓球，说英语
        篮球教练：姓名，年龄，教打篮球
    * */
    public static void main(String[] args) {
        TableAth ta = new TableAth("张三", 20);
        System.out.println(ta.getName() + " " + ta.getAge());
        ta.study();
        ta.speak();

        System.out.println("------------");

        BasketAth ba = new BasketAth("李四", 25);
        System.out.println(ba.getName() + " " + ba.getAge());
        ba.study();

        System.out.println("------------");

        TableCoa tc = new TableCoa("王五", 30);
        System.out.println(tc.getName() + " " + tc.getAge());
        tc.teach();
        tc.speak();

        System.out.println("------------");

        BasketCoa bc = new BasketCoa("赵六", 35);
        System.out.println(bc.getName() + " " + bc.getAge());
        bc.teach();
    }
}
