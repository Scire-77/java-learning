package com.javalearning.oopextendstest5;

public class Test {
    /*
                        方法重写的练习（重点放在Phone类的书写中）

                        某电商项目售卖智能设备，智能设备包括：手机，笔记本电脑，平板
                        1，所有的智能设备有以下属性：商品名，商品价格
                        行为：计算商品价格：

                        [ 0 ~ 1000 ) 元，不打折
                        　[ 1000 ~ 5000 ) 元，9折
                        　[ 5000 ~ 10000 ) 元，8折
                        　超出10000元，7折

                        2，手机享受额外补贴，在原有的基础上打9折。

                        3，笔记本电脑和平板电脑没有额外补贴。
    * */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "xiaomi";
        phone.price = 4999;
        double payment1 = phone.payment();
        System.out.println(payment1);

        Laptop laptop = new Laptop();
        laptop.name = "dell";
        laptop.price = 5999;
        double payment2 = laptop.payment();
        System.out.println(payment2);

        Pad pad = new Pad();
        pad.name = "huawei";
        pad.price = 6999;
        double payment3 = pad.payment();
        System.out.println(payment3);
    }
    /*  方法重写补充:
            1. 重写方法的名称\形参列表必须与父类一致, 方法体则按照需求书写
            2. 子类重写父类方法时, 访问权限必须大于等于父类(private<空着不写<protected<public)
            3.  子类重写父类方法时, 返回值类型子类必须小于等于父类
            4. 建议: 重写方法的申明与父类完全一致
            5. final修饰类为最终类, 里面的方法不能重写. 且这个类不能被继承
            6. 如果方法被private\static\final所修饰, 则不能被重写
    *
    * */
}
