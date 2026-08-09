package com.javalearning.ooptest4;

public class Test {
    public static void main(String[] args) {
        // 大一新生,张三,18岁,183cm,60kg,努力学习
        Student s = new Student();

        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);

        System.out.println(s.getName()+", "+s.getAge()+"岁, "+s.getHeight()+"cm, "+s.getWeight()+"kg");
        s.study();

        // 大二期间,体重增加10kg; 隐藏条件(年龄每年+1)
        s.setWeight(s.getWeight()+10);
        s.setAge(s.getAge() +1);
        System.out.println(s.getName()+", "+s.getAge()+"岁, "+s.getHeight()+"cm, "+s.getWeight()+"kg");

        // 大三期间,身高增加2cm,体重减少3kg
        s.setHeight(s.getHeight()+2);
        s.setWeight(s.getWeight()-3);
        s.setAge(s.getAge() +1);
        System.out.println(s.getName()+", "+s.getAge()+"岁, "+s.getHeight()+"cm, "+s.getWeight()+"kg");

        // 打印毕业后张三所有信息
        s.setAge(s.getAge() +2);    // +1表示刚上大四, 毕业后信息需要+2
        System.out.println(s.getName()+", "+s.getAge()+"岁, "+s.getHeight()+"cm, "+s.getWeight()+"kg");
    }
}
