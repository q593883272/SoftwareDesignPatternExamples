package com.raven.example.dp.creational.factory.abstractf.mi.product;

import com.raven.example.dp.creational.factory.abstractf.LaptopProduct;

/**
 * 小米笔记本产品
 */
public class MiBook implements LaptopProduct {

    private String name;
    private int price;
    private String cpu;
    private String gpu;
    private int ram;
    private int rom;
    private String system;

    public MiBook(String name, int price, String cpu, String gpu, int ram, int rom, String system) {
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
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
        System.out.println(name() + " 开机啦!");

    }

    @Override
    public void shutdown() {
        System.out.println(name() + " 关机啦!");

    }

    @Override
    public void playGame() {
        System.out.println(name() + " 来玩游戏");
    }

    @Override
    public void develop() {
        System.out.println(name() + " 来开发软件");
    }
}
