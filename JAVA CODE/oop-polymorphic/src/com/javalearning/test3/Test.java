package com.javalearning.test3;

public class Test {
    /*                  自行车Bicycle：
                        属性：品牌，行驶速度
                        行为：移动move，响铃ringBell（）

                        汽车Car：
                        属性：品牌，行驶速度
                        行为：移动move，鸣笛honk（）

                        人Person：
                        属性：名字，年龄，性别
                        行为：行驶交通工具（能使用所有交通工具）

                        测试类中创建Person的对象，让这个使用任意一款交通工具
    * */
    public static void main(String[] args) {
        Person p = new Person("John", 25, "Male");

        Bicycle bicycle = new Bicycle("Trek", 20);
        Car car = new Car("Toyota", 60);

        System.out.println("Person " + p.getName() + ", age is " + p.getAge() + " and gender is " + p.getGender());
        p.drive(bicycle);
        p.drive(car);
    }
}
