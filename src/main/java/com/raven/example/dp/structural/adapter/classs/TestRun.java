package com.raven.example.dp.structural.adapter.classs;

/**
 * 类适配器
 *
 * @author Raven 2017年5月29日
 */
public class TestRun {

    public static void main(String[] args) throws Exception {
        Target adapter = new Adapter();
        adapter.connection();
        System.out.println("操作...");
        Thread.sleep(5000L);
        adapter.exit();
    }
}
