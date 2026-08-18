package com.javalearning.oopextendsassignment5;

public class Test {
    /*  ## 继承的作业 5（物流快递运费计算）

        业务场景：
        快递公司需要计算运费，基础快递包含单号 String、重量 int、收件人 String
        行为：计算快递费（计算规则每公斤 10 元，不需要考虑小数部分）
        额外还有两种由基础快递衍生出来的特殊情况

        同城速递：
        重新计算快递费，在原有的基础上 + 10 元

        异地空运：
        重新计算快递费，在原有的基础上 + 15 元
    * */
    public static void main(String[] args) {
        BasicExpress express = new BasicExpress("001", 5, "张三");
        System.out.println("快递单号：" + express.getNum() + ", 重量：" + express.getWeight() + ", 收件人：" + express.getReceiver());
        System.out.println("快递费：" + express.getPrice());

        SameCity sameCity = new SameCity("002", 3, "李四");
        System.out.println("快递单号：" + sameCity.getNum() + ", 重量：" + sameCity.getWeight() + ", 收件人：" + sameCity.getReceiver());
        System.out.println("快递费：" + sameCity.getPrice());

        InterCity interCity = new InterCity("003", 10, "王五");
        System.out.println("快递单号：" + interCity.getNum() + ", 重量：" + interCity.getWeight() + ", 收件人：" + interCity.getReceiver());
        System.out.println("快递费：" + interCity.getPrice());
    }

}
