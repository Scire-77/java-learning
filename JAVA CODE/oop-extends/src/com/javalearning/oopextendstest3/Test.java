package com.javalearning.oopextendstest3;

public class Test {
    /*  继承中成员变量的书写规则: 抽取共性
        继承中成员变量的访问原则: 就近原则
            先找局部,再找本类,再找父类;逐级往上
        (具体注释在Zi类)
    * */
    public static void main(String[] args) {
        Zi z = new Zi();

        z.show();
    }
}
