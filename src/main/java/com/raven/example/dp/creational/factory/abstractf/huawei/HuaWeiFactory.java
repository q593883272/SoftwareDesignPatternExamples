package com.raven.example.dp.creational.factory.abstractf.huawei;

import com.raven.example.dp.creational.factory.abstractf.Factory;
import com.raven.example.dp.creational.factory.abstractf.LaptopProduct;
import com.raven.example.dp.creational.factory.abstractf.PhoneProduct;
import com.raven.example.dp.creational.factory.abstractf.huawei.product.HuaWeiBook;
import com.raven.example.dp.creational.factory.abstractf.huawei.product.HuaWeiPhone;

/**
 * 华为工厂
 */
public class HuaWeiFactory implements Factory {

    @Override
    public PhoneProduct createPhone() {
        return new HuaWeiPhone("HuaWei Mate 30 5G", 4999, "鸿蒙系统");
    }

    @Override
    public LaptopProduct createLaptop() {
        return new HuaWeiBook("华为 Mate Book X", 1199, "i7 10650U", "MX250", 16, 500, "Linux Ubontu 13");
    }
}
