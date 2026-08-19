package com.javalearning.test5;

public interface Inter {
    public default void login(){
       check();
        System.out.println("执行登录的逻辑~");
    }

    public default void register(){
        check();
        System.out.println("执行注册的逻辑~");
    }

   //  普通的私有发方法:
    private void check(){
        System.out.println("检查网络~");
        System.out.println("检查用户名和密码的格式~");
        System.out.println("检查用户名是否存在~");
    }
    // 对于静态方法的私有方法, 只需要在方法前加static关键字即可
}
