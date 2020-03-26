package com.raven.example.dp.structural.adapter.ex2.adaptee;

import com.raven.example.dp.structural.adapter.ex2.Adaptee;

/**
 * MySQL适配者
 */
public class MySqlAdaptee implements Adaptee {

    @Override
    public String dataBaseName() {
        return "MySql";
    }

    @Override
    public void connect() throws Exception {
        System.out.println("正在连接" + dataBaseName() + "...");
        Thread.sleep(3000L);
        System.out.println("已连接到" + dataBaseName() + "!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("正在关闭" + dataBaseName() + "...");
        Thread.sleep(3000L);
        System.out.println("已关闭");
    }
}
