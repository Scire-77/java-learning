package com.javalearning.test3;

public class Test {
            /*  # JDK8以后接口中新增的方法

                允许在接口中定义默认方法，需要使用关键字 `default` 修饰
                作用：为了接口升级时，代码不报错.
                    (开发过程中接口添加新的规则, 以前的JDK版本只能写抽象规则, 所有实现了该接口的类都得去重写方法, 比较麻烦)

               接口中默认方法的定义格式：
                - 格式：`public default 返回值类型 方法名(参数列表){ }`
                - 范例：`public default void show() { }`

                接口中默认方法的注意事项：
                1. 默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉`default`关键字
                2.  `public`可以省略，`default`不能省略
                3. 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
    * */
            public static void main(String[] args) {
               InterImpl ii = new InterImpl();
               ii.method1();
               ii.method2();
               ii.method3();    // 默认方法在接口中, 可以不在实现类里重写; 需要重写的情况下再去掉default重写
            }
}
