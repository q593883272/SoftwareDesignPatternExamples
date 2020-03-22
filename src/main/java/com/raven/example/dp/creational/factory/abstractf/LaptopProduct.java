package com.raven.example.dp.creational.factory.abstractf;

/**
 * 笔记本电脑类产品
 */
public interface LaptopProduct {

    ///////////////////////////////////////////////////////////////////////////
    // Attributes
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 笔记本电脑名称
     */
    String name();

    /**
     * 笔记本电脑价格
     */
    int price();

    /**
     * CPU型号
     */
    String cpu();

    /**
     * 显卡型号
     */
    String gpu();

    /**
     * 内存大小
     */
    int ram();

    /**
     * 存储大小
     */
    int rom();

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
    void boot();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 玩游戏
     */
    void playGame();

    /**
     * 开发
     */
    void develop();

    /**
     * 笔记本电脑属性信息
     */
    default String parameter() {
        return "笔记本电脑属性[型号: " + name() + ", 价格: " + price() + " RMB, CPU: " + cpu() + ", 显卡: " + gpu() + ", 内存: " + ram() + "G, 存储: " + rom() + "G, 系统: " + system() + "]";
    }

}
