package com.javalearning.enumtest;

public enum OrderState {
   /*  定义: public enum 枚举名 {
        枚举项1, 枚举项2, 枚举项3, ...;
        属性;
        构造方法;
        .....
    }
     */
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    private String state;



    private OrderState(String state) {      // 在以上枚举项定义时不用空参构造方法,直接省略即可
        this.state = state;             // 并且构造方法应用private修饰, 否则和枚举的设计初衷就违背了, 因为不需要外界去构造其他对象

    }

    public String getState() {      // 同理, set方法也不用保留
        return state;
    }


}
