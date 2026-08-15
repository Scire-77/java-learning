package com.javalearning.oopextendstest5;

public class Phone extends SmartDevice{
    /*          手机享受额外补贴，在原有的基础上打9折。
        方法重写注意: 如果需要重写的方法逻辑与父类中无关, 不需要用到父类方法的代码, 直接重构方法即可
                如果需要重写的方法与父类方法有关系,或者说是在原有逻辑上进行扩展, 则可以用super调用父类方法,再进行扩展
    * */
    @Override
    public double payment() {
        return super.payment() * 0.9;
    }
}
