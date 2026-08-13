package com.javalearning.toolclasstest;

public class Test {
    /*      工具类练习: 提供一个方法printArr, 用于遍历数组; 2. 提供一个方法getAverage用于返回平均分
    * */
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        String res = ArrayUtil.printArray(arr);
        System.out.println(res);

        double avg = ArrayUtil.getAverage(arr);
        System.out.println(avg);
    }
    /*  静态的注意事项补充: 1. 静态方法只能访问静态变量和其他静态方法(静态里只能访问静态)
        2. 非静态方法可以访问静态变量或静态方法, 也可以访问非静态的
        3. 静态方法中没有this关键字
        总结: 静态只能调用静态, 非静态可以访问所有, 静态方法无this
        ( 原因在于静态变量与方法的加载时机先于非静态, 内存中有静态的内容时不一定有非静态内容.)
    * */

    /*  重新认识main方法: public static void main(String[] args){}
        public: 被JVM调用, 访问权限最大
        static: 被JVM调用, 类名访问. 由于是静态的,所以main方法中写的其他方法也必须是静态的
        void: 表示不需要给JVM返回值
        main: 固定的名字, 被JVM识别
        String[] args: 用于接收运行的参数, 目前不用
    * */
}
