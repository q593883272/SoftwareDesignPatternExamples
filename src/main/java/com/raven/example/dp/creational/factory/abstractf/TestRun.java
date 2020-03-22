package com.raven.example.dp.creational.factory.abstractf;

import com.raven.example.dp.creational.factory.abstractf.mi.MiFactory;
import com.raven.example.dp.creational.factory.abstractf.huawei.HuaWeiFactory;

/**
 * 抽象工厂
 *
 * @author Raven 2017年5月29日
 */
public class TestRun {

    public static void main(String[] args) {
        //小米
        Factory miFactory = new MiFactory();
        PhoneProduct miPhone = miFactory.createPhone();
        System.out.println(miPhone.parameter());
        miPhone.on();
        miPhone.call(120L);
        miPhone.off();
        LaptopProduct miLaptop = miFactory.createLaptop();
        System.out.println(miLaptop.parameter());
        miLaptop.boot();
        miLaptop.playGame();
        miLaptop.shutdown();
        System.out.println("////////////////////////////////////////////////////////////////");
        //华为
        Factory huaWeiFactory = new HuaWeiFactory();
        PhoneProduct huaWeiPhone = huaWeiFactory.createPhone();
        System.out.println(huaWeiPhone.parameter());
        huaWeiPhone.on();
        huaWeiPhone.call(110L);
        huaWeiPhone.off();
        LaptopProduct huaWeiLaptop = huaWeiFactory.createLaptop();
        System.out.println(huaWeiLaptop.parameter());
        huaWeiLaptop.boot();
        huaWeiLaptop.develop();
        huaWeiLaptop.shutdown();
    }
}
