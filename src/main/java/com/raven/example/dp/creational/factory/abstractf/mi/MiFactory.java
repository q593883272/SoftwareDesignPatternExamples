package com.raven.example.dp.creational.factory.abstractf.mi;

import com.raven.example.dp.creational.factory.abstractf.Factory;
import com.raven.example.dp.creational.factory.abstractf.LaptopProduct;
import com.raven.example.dp.creational.factory.abstractf.PhoneProduct;
import com.raven.example.dp.creational.factory.abstractf.mi.product.MiBook;
import com.raven.example.dp.creational.factory.abstractf.mi.product.MiPhone;

/**
 * 小米工厂
 */
public class MiFactory implements Factory {

    @Override
    public PhoneProduct createPhone() {
        return new MiPhone("小米手机6", 1999, "Android 9");
    }

    @Override
    public LaptopProduct createLaptop() {
        return new MiBook("小米笔记本 Pro 15", 5999, "i7 10510U", "MX250", 16, 1000, "Windows 10");
    }
}
