package com.javalearning.test2;

public class Test {
    /*  多态中的调用规则:
        1. 变量调用: 编译看左边, 运行看左边
        2. 方法调用: 编译看左边, 运行看右边

    * */
    public static void main(String[] args) {
        // 调用多态方式创建对象
        Fu f = new Zi();

        /*  调用成员变量:
            编译看左边: 把java文件编译成class文件时, 看左边的类型Fu, 父类中有这个变量则编译成功, 否则失败
            运行看左边: 在代码运行时候, 使用父类中的变量
        * */
        System.out.println(f.name);
        //  System.out.println(f.age);   编译失败, 因为Fu类中没有age变量


        /*  调用成员方法:
            编译看左边: 看父类, 其中有这个方法则编译成功, 否则失败
            运行看右边: 在代码运行时候, 调用子类中的方法; 如果子类没有重写这个方法, 再运行父类中的方法
        * */
        f.show();

        // 调用f.fuShow不报错, 就是因为父类Fu中定义了这个方法
        f.fuShow();

        //f.ziShow();  调用子类方法, 编译报错, 因为Fu类中没有这个方法; 所以多态的弊端在于不能调用子类的特有方法

        // 解决多态的弊端: 把对象在强制转换成子类类型即可;    自动类型转换(向上转型); 强制类型转换(向下转型)
        Zi zi = (Zi) f;
        zi.ziShow();

        // 注意: 强制转换时只能转换成原本的子类类型, 否则运行后会报错
        // 如: Object->Fu->Zi    创建Fu对象赋值给Object(多态), 在强制转换时, 只能转换成Fu,不能转换成Zi
        Ye ye = new Fu();
        // 所以要判断一下类型( instanceof关键字: 左侧变量右侧类)
        if (ye instanceof Fu) {
            Fu ff = (Fu) ye;
            ff.fuShow();
            ff.show();      // 调用到了父类中的show方法, 而不是直接f.show输出子类重写后的方法
        }else{
            System.out.println("转换类型异常");
        }

    }
}
