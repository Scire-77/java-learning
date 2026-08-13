package com.javalearning.enumtest;

public class Test1 {
    /*  枚举: 是一类特殊的Javabean类, 这个类的对象是有限个的

        枚举注意事项补充: 1. 每一个枚举项, 都是该类枚举的对象. 每一个对象都是通过构造方法创建出来的.
        2. 枚举项在底层其实就是常量, 默认public static final修饰(可以通过反编译.class文件查看, cmd中输入javap .class文件)
        3. 枚举类的第一行必须是枚举项.
        4. 枚举类的构造方法必须是private(默认就是private, 可以不写), 不让外界创建本类对象
        5. 编译器会给枚举类新增两个默认的方法: values() 和 valueOf()  (也可通过反编译查看到)
            values(): 表示获取本类的所有枚举项.(数组类型)
            valueOf(): 表示获取指定一个的枚举项. (和用枚举名.枚举项名来获取一个道理)

        电商项目中，订单的状态只有以下6种，请编写代码实现。
            待支付    PAYMENT_PENDING
            处理中    PROCESSING
            已发货    SHIPPED
            配送中    OUT_FOR_DELIVERY
            已送达    DELIVERED
            已取消    CANCELLED
    * */

    public static void main(String[] args) {

        // 细节:  所有的枚举项, 默认都是用public static final来修饰的, 所以调用方法可以直接用类名.枚举项
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getState());

        // 匹配
        switch(o1){
            case PAYMENT_PENDING:
                System.out.println("待支付状态");  // case PAYMENT_PENDING: -> sout
                break;
            case PROCESSING:
                System.out.println("处理中");
                break;
            case SHIPPED:
                System.out.println("已发货");
                break;
            case OUT_FOR_DELIVERY:
                System.out.println("配送中");
                break;
            case DELIVERED:
                System.out.println("已送达");
                break;
            case CANCELLED:
                System.out.println("已取消");
                break;
        }

        System.out.println("----------------------------");
        OrderState[] orderStates = OrderState.values();
        for (int i = 0; i < orderStates.length; i++) {
            System.out.println(orderStates[i]);
        }

        System.out.println("----------------------------");
        OrderState o2 = OrderState.valueOf("PAYMENT_PENDING");
        System.out.println(o2);
    }
}
