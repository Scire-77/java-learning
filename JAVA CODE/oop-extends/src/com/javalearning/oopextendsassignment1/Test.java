package com.javalearning.oopextendsassignment1;

public class Test {
     /*      继承的作业 1（餐饮菜品推荐）

            1. 经理
            成员变量：工号，姓名，工资，管理奖金
            成员方法：工作 (管理其他人)，吃饭 (吃米饭)
            2. 厨师
            成员变量：工号，姓名，工资
            成员方法：工作 (炒菜)，吃饭 (吃米饭)
    * */
     public static void main(String[] args) {
         Manager m = new Manager(1, "张三", 5000, 1000);
         System.out.println(m.getNum() + " " + m.getName() + " " + m.getSalary() + " " + m.getBonus());
         m.work();
         m.eat();

         System.out.println("---------------------------");

         Cook c = new Cook(2, "李四", 3000);
         System.out.println(c.getNum() + " " + c.getName() + " " + c.getSalary());
         c.work();
         c.eat();
     }
}
