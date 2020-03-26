package com.raven.example.dp.behavioral.command.ex2.phone;

public class PhoneReceiver {

    public void on() {
        System.out.println("打开手机...");
    }

    public void call(String phoneNumber) {
        System.out.println("使用手机拨打电话: [" + phoneNumber + "]...");
    }

    public void off() {
        System.out.println("关闭手机...");
    }
}
