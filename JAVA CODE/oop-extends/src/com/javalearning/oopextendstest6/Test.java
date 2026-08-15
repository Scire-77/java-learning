package com.javalearning.oopextendstest6;

public class Test {
    /*  继承中的构造方法特点:
                子类不能继承父类的构造方法, 但是可以通过super调用

                    根据下面的描述定义继承结构
                    学生：
                            属性：姓名、年龄、年级
                    老师：
                            属性：姓名、年龄、学科


        继承中构造方法的细节:
            1. 子类构造方法第一行有一个默认的super(),如果没有书写JVM也会加上
            2. 如果想要访问父类的带参构造, super(参数)必须手动写上, 不能省略. (省略后由于细节1,只能访问父类的无参构造)
            3. 在创建对象时, 先执行父类的构造方法, 再执行子类的构造方法 (JDK高版本已经不限制super(参数)的位置, 但推荐写在第一行)
*/
    public static void main(String[] args) {
        Student student = new Student("张三", 18, "一年级");
        System.out.println(student.name + " " + student.age + " " + student.grade);

        System.out.println("-------------------------------------------------");

        Student student2 = new Student();

        System.out.println("-------------------------------------------------");

        Teacher teacher = new Teacher("张老师", 30, "数学");
        System.out.println(teacher.name + " " + teacher.age + " " + teacher.subject);

        System.out.println("-------------------------------------------------");
        Teacher teacher2 = new Teacher();
    }
}
