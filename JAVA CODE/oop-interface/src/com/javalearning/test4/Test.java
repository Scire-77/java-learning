package com.javalearning.test4;

public class Test {
    /*  # JDK8以后接口中新增的方法

        允许在接口中定义静态方法，需要用`static`修饰
            把和接口业务强相关的工具方法直接写在接口内部，不用额外再新建一个工具类。
            接口只能写抽象方法的话, 如果这个接口需要配套一些工具逻辑，必须单独再写一个 Util工具类，代码分散。

        接口中静态方法的定义格式：
        - 格式：`public static 返回值类型 方法名(参数列表) { }`
        - 范例：`public static void show() { }`

        接口中静态方法的注意事项：
        1. 静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        2. `public`可以省略，`static`不能省略
    * */
    public static void main(String[] args) {
        Inter.method1();


    }
}
