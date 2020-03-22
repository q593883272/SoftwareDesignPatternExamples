package com.raven.example.dp.creational.builder.ex2;

/**
 * 省略抽象的高内聚建造者模式
 *
 * @author Raven 2017年5月29日
 */
public class TestRun {

    public static void main(String[] args) {

        Product p1 = new Product.Builder()
                .buildName("苹果")
                .buildPrice(18)
                .buildWeight(1000)
                .build();
        System.out.println(p1);

        Product p2 = new Product.Builder()
                .buildName("香蕉")
                .buildPrice(22)
                .buildWeight(500)
                .build();
        System.out.println(p2);
    }

}
