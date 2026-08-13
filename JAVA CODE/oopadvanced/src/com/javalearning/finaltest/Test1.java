package com.javalearning.finaltest;

public class Test1 {
    /*  final关键字: 表示最终, 不可变. 能够修饰类, 方法, 变量
        1. 修饰类: 表示该类不能被继承
        2. 修饰方法: 表示该方法不能被重写
        3. 修饰变量: 表示该变量的值不能被修改

        修饰变量,此时称为常量.
        特点1: 只能赋值一次, 数据不可变 特点2: 名字大写, 多个单词下划线分隔
        细节:
            基本数据类型: int, double, char, boolean,byte, short, long, float
                里面记录的是真实数据, 用final修饰, 意味着变量中记录的数据无法改变
            引用数据类型: 除去以上的四类八种, 其他的数据类型. int[]. Student. ...
                里面记录的是地址, 用final修饰, 意味着变量中记录的地址无法改变, 但是地址指向的数据可以改变
            综上, final修饰哪个变量, 这个变量记录的"内容" 就无法再次发生改变
    * */
    public static void main(String[] args) {
        final int NUMBER = 10;
        System.out.println(NUMBER);

        final Student stu = new Student("张三", 18);
        System.out.println(stu.getName() + " " + stu.getAge());

        stu.setAge(20);
        System.out.println(stu.getName() + " " + stu.getAge());
    }
}
