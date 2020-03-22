package com.raven.example.dp.creational.builder.ex1;

/**
 * 建造者模式
 *
 * @author Raven 2017年5月29日
 */
public class TestRun {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        System.out.println(director.construct());
    }

}
