package com.raven.example.dp.behavioral.command.ex1.tv;

public class TVReceiver {

    public void open() {
        System.out.println("开电视...");
    }

    public void previous() {
        System.out.println("切换至上一个频道...");
    }

    public void next() {
        System.out.println("切换至下一个频道...");
    }

    public void close() {
        System.out.println("关电视...");
    }

}
