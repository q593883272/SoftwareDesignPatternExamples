package com.raven.example.dp.creational.factory.abstractf;

/**
 * 抽象工厂
 */
public interface Factory {

    /**
     * 制造手机
     */
    PhoneProduct createPhone();

    /**
     * 制造笔记本电脑
     */
    LaptopProduct createLaptop();
}
