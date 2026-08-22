package com.javalearning.apidemo5;

import java.util.Scanner;

public class Test1 {
    /*  数据过滤:
            String replace(旧值,新值) 替换
            注意点：只有返回值才是替换之后的结果

            subString截取：截取固定位置的数据
            replace替换：位置不确定，替换指定内容

            需求：
            过滤玩游戏中骂人的脏话
    * */
    public static void main(String[] args) {
        // replace示例
        String str = "阿弥诺斯,TMD";
        String res = str.replace("TMD", "****");
        System.out.println(res);


        // 需求实现
        // 定义一个敏感词库
        String[] arr ={"TMD","SB","LJ","CB"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要说的话：");
        String msg = sc.next();

        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i], "****");
        }

        System.out.println(msg);
    }
}
