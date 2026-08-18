package com.javalearning.oopextendstest8;

public class Test {
    /*          带有继承结构的标准JavaBean类

                书写一个完整的继承体系，要求私有化成员变量、get/set方法、构造方法、其他的成员方法

                本科学生：
                属性：姓名、年龄、年级
                行为：吃饭、睡觉、学习（攻读学士学位）

                硕士研究生：
                属性：姓名、年龄、年级
                行为：吃饭、睡觉、学习（攻读硕士学位）

                专业课老师：
                属性：姓名、年龄、学科
                行为：吃饭、睡觉、教书（教专业课知识）

                通识课老师：
                属性：姓名、年龄
                行为：吃饭、睡觉、教书（教通识课知识）

                过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
    * */
    public static void main(String[] args) {
        BachelorStudent bs = new BachelorStudent("张三", 20, "大三");
        System.out.println(bs.getName() + " " + bs.getAge() + " " + bs.getGrade());
        bs.eat();
        bs.sleep();
        bs.study();

        System.out.println("-------------------------------");

        MasterStudent ms = new MasterStudent("李四", 24, "硕士");
        System.out.println(ms.getName() + " " + ms.getAge() + " " + ms.getGrade());
        ms.eat();
        ms.sleep();
        ms.study();

        System.out.println("-------------------------------");

        MajorTeacher mt = new MajorTeacher("王五", 30, "计算机");
        System.out.println(mt.getName() + " " + mt.getAge() + " " + mt.getSubject());
        mt.eat();
        mt.sleep();
        mt.teach();

        System.out.println("-------------------------------");

        GeneralTeacher gt = new GeneralTeacher("赵六", 25, "英语");
        System.out.println(gt.getName() + " " + gt.getAge() + " " + gt.getSubject());
        gt.eat();
        gt.sleep();
        gt.teach();
    }
}
