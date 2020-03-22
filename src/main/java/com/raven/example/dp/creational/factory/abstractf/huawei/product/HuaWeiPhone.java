package com.raven.example.dp.creational.factory.abstractf.huawei.product;

import com.raven.example.dp.creational.factory.abstractf.PhoneProduct;

/**
 * 华为手机产品
 */
public class HuaWeiPhone implements PhoneProduct {

    private String phoneName;
    private int phonePrice;
    private String phoneSystem;

    public HuaWeiPhone(String phoneName, int phonePrice, String phoneSystem) {
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
        this.phoneSystem = phoneSystem;
    }

    @Override
    public String name() {
        return phoneName;
    }

    @Override
    public int price() {
        return phonePrice;
    }

    @Override
    public String system() {
        return phoneSystem;
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
    public void call(Long phoneNumber) {
        System.out.println(name() + " 打给[" + phoneNumber + "]!");
    }
}
