package com.javalearning.test1;

public class Test {
    /*  多态: 事物的多种形态
        表现形式: 父类类型 对象名称 = 子类对象; Fu f = new Zi();
        多态的前提:
            1. 有继承/实现关系(必须)
            2. 有父类引用指向子类对象(必须)
            3. 有方法重写(可选)
         多态的好处: 1. 方法中用父类型做参数, 可以接受父类对象+所有子类对象
                    2. 如果进行方法重写, 利用多态调用方法, 可以调用不同子类中重写的方法
    * */
                /*学生类：
                属性：姓名，账号，密码
                行为：work：学生的工作是学习

                老师类：
                属性：姓名，账号，密码
                行为：work：老师的工作是教书

                管理员：
                属性：姓名，账号，密码
                行为：work：管理员的工作是管理网站

                学生管理系统：
                行为：注册register
                要求：能注册所有的角色
                输出：姓名为张三的同学注册成功，账号zhangsan，密码123456
    *
    * */
    public static void main(String[] args) {
        Admin a = new Admin("张三", "zhangsan", "123456");
        Student s = new Student("李四", "lisi", "12334536");
        Teacher t = new Teacher("王五", "wangwu", "12345466");

        StudentManager sm = new StudentManager();
        sm.register(a);
        sm.register(s);
        sm.register(t);
    }
}
