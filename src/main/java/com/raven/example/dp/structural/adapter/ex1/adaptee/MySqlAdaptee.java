package com.raven.example.dp.structural.adapter.ex1.adaptee;

public class MySqlAdaptee {


    public String dataBaseName() {
        return "MySql";
    }

    public void connect() throws Exception {
        System.out.println("正在连接" + dataBaseName() + "...");
        Thread.sleep(3000L);
        System.out.println("已连接到" + dataBaseName() + "!");
    }

    public void close() throws Exception {
        System.out.println("正在关闭" + dataBaseName() + "...");
        Thread.sleep(3000L);
        System.out.println("已关闭");
    }
}
