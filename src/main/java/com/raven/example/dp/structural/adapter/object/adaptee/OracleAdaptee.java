package com.raven.example.dp.structural.adapter.object.adaptee;

/**
 * Oracle适配者
 */
public class OracleAdaptee implements Adaptee {

    @Override
    public String dataBaseName() {
        return "Oracle";
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
