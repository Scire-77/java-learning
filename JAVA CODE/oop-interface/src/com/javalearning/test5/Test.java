package com.javalearning.test5;

public class Test {
            /*# JDK9新增的私有方法

                为了抽取默认方法和静态方法中重复代码而出现的
                    default方法既然有方法体, 就有可能出现重复代码的情况. 想要抽取重复代码重新定义一个方法出来给接口服务,
                    以避免冗余, 并且这个方法只给接口服务, 不需要其他的类访问. 就需要新增private方法

                普通的私有方法: 为了抽取默认方法中重复代码
                - 格式1：`private 返回值类型 方法名(参数列表) { }`
                - 范例1：`private void show() { }`

                静态的私有方法: 为了抽取静态方法的重复代码
                - 格式2：`private static 返回值类型 方法名(参数列表) { }`
                - 范例2：`private static void method() { }`
    * */
}
