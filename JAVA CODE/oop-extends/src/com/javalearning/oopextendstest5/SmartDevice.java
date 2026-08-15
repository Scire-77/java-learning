package com.javalearning.oopextendstest5;

public class SmartDevice {
    /*          所有的智能设备有以下属性：商品名，商品价格
                        行为：计算商品价格：

                        [ 0 ~ 1000 ) 元，不打折
                        　[ 1000 ~ 5000 ) 元，9折
                        　[ 5000 ~ 10000 ) 元，8折
                        　超出10000元，7折
    * */

    String name;
    double price;
    public double payment(){
        if (price >= 0 && price < 1000){
            return price;
        }else if (price >= 1000 && price < 5000){
            return price * 0.9;
        }else if (price >= 5000 && price < 10000){
            return price * 0.8;
        }else if (price >= 10000) {
            return price * 0.7;
        }else{
            return 0;
        }
    }
}
