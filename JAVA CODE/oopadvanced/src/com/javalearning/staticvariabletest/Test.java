package com.javalearning.staticvariabletest;

public class Test {
    /*  Static关键字: 表示静态, 用来修饰成员变量与成员方法
    *   特点: 叫做静态变量, 被该类所有变量共享
    *   共享: 赋值只需要一次, 且只要有对象修改了静态变量,其他对象再次访问时, 就是修改后的结果
    *   调用方法: 1.类名调用(推荐) 2. 对象名调用
    * */
    public static void main(String[] args) {
            Student stu1 = new Student();
            stu1.name = "张三";
            stu1.age = 18;

            // 类名调用
            Student.teacherName = "张老师";
//          对象名调用:  stu1.teacherName = "张老师";

            Student stu2 = new Student();
            stu2.name = "李四";
            stu2.age = 19;

        System.out.println(stu1.name+", "+stu1.age + ", " + stu1.teacherName);
        System.out.println(stu2.name+", "+stu2.age + ", " + stu2.teacherName);

        System.out.println("-------------------------");
            stu2.teacherName = "王老师";

        System.out.println(stu1.name+", "+stu1.age + ", " + stu1.teacherName);
        System.out.println(stu2.name+", "+stu2.age + ", " + stu2.teacherName);
    }
}
