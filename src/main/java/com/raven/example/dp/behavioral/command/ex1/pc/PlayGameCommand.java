package com.raven.example.dp.behavioral.command.ex1.pc;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * PC[玩游戏]命令
 */
public class PlayGameCommand implements NoParamCommand {

    private final PCReceiver receiver;

    public PlayGameCommand(PCReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.playGames();
    }
}
