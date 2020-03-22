package com.raven.example.dp.creational.builder.ex1;

/**
 * 抽象建造者
 *
 * @author Raven 2017年4月10日
 */
public interface Builder {

    Builder buildName(String name);

    Builder buildPrice(int price);

    Builder buildWeight(int weight);

    Product build();
}
