package com.javalearning.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        double weight=60.5;
        double height=1.75;
        double bmi = weight / (height * height);
        System.out.println("BMI is "+bmi);

        System.out.println("当前身高在标准BMI下，最多是："+(height * height * 23.9));
    }
}
