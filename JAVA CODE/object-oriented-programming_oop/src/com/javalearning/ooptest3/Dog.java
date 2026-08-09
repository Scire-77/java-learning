package com.javalearning.ooptest3;

public class Dog {
    // 面向对象数据安全问题(直接调用成员变量的方式若是赋值不符合预期, 代码可能不会报错. 如d1.age = -1;)
    // private关键字: 权限修饰符,可以修饰成员变量和成员方法; 一旦被修饰,只能在本类中被访问, 外界无法访问
    // get/set方法: 用public修饰,针对private的成员变量,提供获取和赋值的方法. set用于赋值,可以进行范围判断过滤;

    private String name;
    private int age;

    // 注意所有私有化的成员变量都应提供对应的方法
    // name;  value表示将来要赋的值
    public void setName(String value){
        // 给对象中属性赋值
        name = value;
    }

    public String getName(){
        // 提供返回值
        return name;
    }

    //age ;
    public void setAge(int num){
        if(num >= 0 && num <= 15){
            age = num;
        }else{
            System.out.println("请输入正确的年龄");
        }
    }

    public int getAge(){
        return age;
    }

    // 行为
    public void eat(){
        System.out.println(age+"岁的"+name+"正在吃骨头.");
    }
}
