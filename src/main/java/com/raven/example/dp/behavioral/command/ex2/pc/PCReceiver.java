package com.raven.example.dp.behavioral.command.ex2.pc;

/**
 * PC命令执行者
 */
public class PCReceiver {

    public void boot() {
        System.out.println("电脑开机...");
    }

    public void playGames() {
        System.out.println("用电脑Van游戏...");
    }


    public void shutdown() {
        System.out.println("电脑关机...");
    }
}
