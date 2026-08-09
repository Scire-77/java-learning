package com.javalearning.ooptest3;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.setName("小白");
        d1.setAge(2);

        System.out.println(d1.getName()+", "+d1.getAge());  // 若是set的值不符合范围,会输出默认初始化值,如NULL,0等;
        d1.eat();

    }
}
