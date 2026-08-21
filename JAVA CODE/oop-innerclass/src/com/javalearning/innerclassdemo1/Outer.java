package com.javalearning.innerclassdemo1;

public class Outer {
    String name;
    private int a =10;

    class Inner{
        static int A = 999;

        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(Outer.this.a);       // 10 当外部类变量和内部类重名, 想获取外部变量值就Outer.this.变量名
            System.out.println(this.a);       // 20
           System.out.println(a);       // 30
        }
    }

    public Inner getInnerInstance(){
        return new Inner();
    }
}
