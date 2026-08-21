package com.javalearning.innerclassdemo4;

public class Test {
    /*  匿名内部类
        就是一个没有名字的内部类, 可以写在成员位置, 也可以写在局部位置
        作用：在继承一个类或者实现一个接口的时候少写一个文件，也是lambda的前置知识点
        使用场景: 如果实现类只需要用一次, 可以用匿名内部类简化代码

        定义格式：
        new 类名/接口名() {
            重写方法;
        };

        意味着: 没有名字的Java类 + 继承/实现 + 重写方法 +创建对象;
        没有名字的Java类: 指的是后面的大括号, 又因为写在了其他类的内部(Test类), 所以叫匿名内部类
        继承/实现: 这个没有名字的JAVA类完成了继承/实现功能 (实现了swim接口)
        重写方法: 大括号中重写所有抽象方法 (swim接口中的所有抽象方法)
        创建对象: 使用new关键字创建对象, 注意new的不是有名字的接口或类, 而是后面大括号的这个没有名字的JAVA类

        最终格式可以理解为是一个没有名字的JAVA类的对象
    * */
    public static void main(String[] args) {
        Student s = new Student();
        goSwimming(s);
        // 问题在于: 如果这个Student类在开发中只用一次, 那么就显得有些麻烦了; 所以可以使用匿名内部类来少定义一个文件


        // 对象可以赋值给一个变量;
        Swim s2 = new Swim(){
            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        };  // 注意定义成变量需要有个分号
        // 整体: 创建了一个swim实现类的对象, 只不过这个类没有名字而已(把一个实现类的对象赋值给接口, 多态)
        goSwimming(s2);

        // 既然最终格式是一个对象, 那么可以直接放在方法的参数位置
        goSwimming(new Swim(){
            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        });

    }


    // 想要调用这个方法, 接收参数是一个swim接口, 也就是需要一个swim接口的实现类
    // 传统实现方法: 新建一个类文件, 在其中实现swim接口并重写其中的抽象方法; 再在测试类新建对象并调用下面这个方法
    public static void goSwimming(Swim s){
        s.swim();
    }
}
