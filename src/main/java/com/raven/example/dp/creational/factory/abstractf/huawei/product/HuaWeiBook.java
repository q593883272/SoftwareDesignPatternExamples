package com.raven.example.dp.creational.factory.abstractf.huawei.product;

import com.raven.example.dp.creational.factory.abstractf.LaptopProduct;

/**
 * 华为笔记本产品
 */
public class HuaWeiBook implements LaptopProduct {

    private String bookName;
    private int bookPrice;
    private String cpu;
    private String gpu;
    private int ram;
    private int rom;
    private String system;

    public HuaWeiBook(String bookName, int bookPrice, String cpu, String gpu, int ram, int rom, String system) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
        this.system = system;
    }

    @Override
    public String name() {
        return bookName;
    }

    @Override
    public int price() {
        return bookPrice;
    }

    @Override
    public String cpu() {
        return cpu;
    }

    @Override
    public String gpu() {
        return gpu;
    }

    @Override
    public int ram() {
        return ram;
    }

    @Override
    public int rom() {
        return rom;
    }

    @Override
    public String system() {
        return system;
    }

    @Override
    public void boot() {
        System.out.println(name() + " 开机!");

    }

    @Override
    public void shutdown() {
        System.out.println(name() + " 关机!");

    }

    @Override
    public void playGame() {
        System.out.println("用" + name() + " 玩游戏");
    }

    @Override
    public void develop() {
        System.out.println("用" + name() + " 开发软件");
    }
}
