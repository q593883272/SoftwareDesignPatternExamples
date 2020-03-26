package com.raven.example.dp.creational.factory.abstractf;

/**
 * 手机类产品
 */
public interface PhoneProduct {

    ///////////////////////////////////////////////////////////////////////////
    // Attributes
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 手机名称
     */
    String name();

    /**
     * 手机价格
     */
    int price();

    /**
     * 系统
     */
    String system();

    ///////////////////////////////////////////////////////////////////////////
    // Actions
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 开机
     */
    void on();

    /**
     * 关机
     */
    void off();

    /**
     * 打电话
     */
    void call(String phoneNumber);

    /**
     * 手机属性信息
     */
    default String parameter() {
        return "手机属性[型号: " + name() + ", 价格: " + price() + " RMB, 系统: " + system() + "]";
    }

}
