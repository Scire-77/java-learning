package com.javalearning.test1;

public class StudentManager {
    public StudentManager() {
    }

    // 传递的参数是 Person, 表示既可以接受本类的对象, 也可以接受其子类的对象, 实现了多态
    public void register(Person person) {
        System.out.println("姓名为" + person.getName() + "的用户注册成功，账号" + person.getUsername() + "，密码" + person.getPassword());
        person.work(); // 调用的是子类重写的方法, 不同的子类如果重写了work方法, 输出的是重写后的结果

    }
}
