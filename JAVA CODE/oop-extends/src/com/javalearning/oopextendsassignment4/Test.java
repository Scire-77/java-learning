package com.javalearning.oopextendsassignment4;

public class Test {
    /*  ## 继承的作业 4（电商项目）

        业务场景：
        某电商平台需要管理商品，基础商品包含名称、价格
        行为：showInfo () 展示所有的属性
        要求子类按照要求，扩展特有属性

        电子产品：
        增加品牌、型号
        行为：打印名称，价格，品牌，型号等所有属性

        服装：
        增加尺寸、颜色
        行为：打印名称，价格，尺寸，颜色等所有属性
    * */
    public static void main(String[] args) {
        Clothes clothes = new Clothes("T-shirt", 100, "M", "Red");
        clothes.showInfo();

        Electronics electronics = new Electronics("Laptop", 1000, "Dell", "XPS");
        electronics.showInfo();
    }
}
