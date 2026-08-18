package com.javalearning.test3;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void drive(Vehicle vehicle){
        vehicle.move();

        // 需要针对不同类型的载具做出不同行为, 多态不能直接调用子类独有的行为, 需要强制转换
        if(vehicle instanceof Car){
            Car c = (Car) vehicle;
            c.honk();
        }else if(vehicle instanceof Bicycle){
            Bicycle b = (Bicycle) vehicle;
            b.ringBell();
        }else{
            System.out.println("This vehicle is not recognized");
        }

    }
}


