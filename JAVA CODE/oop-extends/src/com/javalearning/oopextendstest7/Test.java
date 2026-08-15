package com.javalearning.oopextendstest7;

public class Test {
                    /*      默认名字的 JavaBean
                        按照下面的需求书写一个 JavaBean
                        学生：
                        属性：姓名、年龄

                        当我们在学校里面不认识一个同学的时候，都会称呼对方：同学
                        所以现在认为学生的默认名字为：同学，默认年龄为 18 岁

                this(): 表示调用本类的其他构造方法
                    细节:
                    1. 如果子类中有多个构造方法, 不能用this()互相调用, 一定要预留一个调用父类的构造方法
                     (就是说如果Student类还有一个父类,那么无参和有参构造方法中不能同时使用this()互相调用, 预留一个就算不写也会有默认的super())
                    2. 如果构造方法写了this(), 就不能再用super(), JVM也不会自动添加super()
                    3. 在老版本JDK,this()只能写在构造方法第一行, 新版本中去除了这个限制(习惯上还是写第一行)
    * */
                    public static void main(String[] args) {
                        Student student = new Student();
                        System.out.println(student.name + " " + student.age);
                    }

                    /*  this 和 super 关键字
                        this 内存的角度：表示当前方法调用者的地址值
                        this 代码的角度：利用 this 可以直接调用本类成员（比如：成员变量，成员方法，构造方法等）
                        super 关键字：代表使用父类中的内容

                        this/super.成员变量/方法 表示访问本类/父类的成员变量/方法
                        this/super() 表示调用本类/父类的构造方法
                    * */
}
