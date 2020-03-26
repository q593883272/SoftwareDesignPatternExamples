package com.raven.example.dp.creational.factory.abstractf.mi.product;

import com.raven.example.dp.creational.factory.abstractf.PhoneProduct;

/**
 * 小米手机产品
 */
public class MiPhone implements PhoneProduct {

    private String name;
    private int price;
    private String system;

    public MiPhone(String name, int price, String system) {
        this.name = name;
        this.price = price;
        this.system = system;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String system() {
        return system;
    }

    @Override
    public void on() {
        System.out.println(name() + " 开机!");
    }

    @Override
    public void off() {
        System.out.println(name() + " 关机!");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println(name() + " 打电话给[" + phoneNumber + "]!");
    }
}
