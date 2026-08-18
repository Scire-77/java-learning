package com.javalearning.oopextendsassignment3;

public class Test {
    /*  ## 继承的作业 3（餐饮菜品推荐）

        业务场景：
        餐厅菜品系统的继承体系构建

        热菜：
        属性：菜名、价格、口味、烹饪时间
        行为：菜品介绍（如:"热菜水煮鱼，价格 88 元，口味麻辣，烹饪时间 20 分钟，适合重口味食客"）

        凉菜：
        属性：菜名、价格、口味、保质期
        行为：菜品介绍（如:"凉菜拍黄瓜，价格 10 元，口味酸辣，保质期 30 分钟，适合所有食客"）
    * */
    public static void main(String[] args) {
        HotDish h = new HotDish("水煮鱼", 88.0, "麻辣", 20);
        h.intro();

        ColdDish c = new ColdDish("拍黄瓜", 10.0, "酸辣", 30);
        c.intro();
    }
}
