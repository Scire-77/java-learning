package com.javalearning.oopextendsassignment2;

public class Test {
    /*  ## 继承的作业 2（餐饮菜品推荐）

        在公司中有很多员工 (Employee)
        按照工作内容不同分教研部员工 (Teacher) 和行政部员工 (AdminStaff)

        1. 教研部根据教学的方式不同又分为讲师 (Lecturer) 和助教 (Tutor)
        2. 行政部根据负责事项不同，又分为维护专员 (Maintainer), 采购专员 (Buyer)
        3. 公司的每一个员工都编号，姓名和其负责的工作
        4. 每个员工都有工作的功能，但是具体的工作内容又不一样。
    * */
    public static void main(String[] args) {
        Employee employee = new Employee(1, "张三");
        System.out.println("员工编号：" + employee.getNum() + ", 员工姓名：" + employee.getName());
        employee.work();

        System.out.println("--------------------------------------------------");

        Maintainer maintainer = new Maintainer(2, "李四");
        System.out.println("员工编号：" + maintainer.getNum() + ", 员工姓名：" + maintainer.getName());
        maintainer.work();

        Buyer buyer = new Buyer(3, "王五");
        System.out.println("员工编号：" + buyer.getNum() + ", 员工姓名：" + buyer.getName());
        buyer.work();

        System.out.println("--------------------------------------------------");

        Lecturer lecturer = new Lecturer(4, "赵六");
        System.out.println("员工编号：" + lecturer.getNum() + ", 员工姓名：" + lecturer.getName());
        lecturer.work();

        Tutor tutor = new Tutor(5, "孙七");
        System.out.println("员工编号：" + tutor.getNum() + ", 员工姓名：" + tutor.getName());
        tutor.work();
    }
}
