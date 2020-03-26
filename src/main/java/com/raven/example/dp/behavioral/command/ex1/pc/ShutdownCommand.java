package com.raven.example.dp.behavioral.command.ex1.pc;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * PC[关机]命令
 */
public class ShutdownCommand implements NoParamCommand {

    private final PCReceiver receiver;

    public ShutdownCommand(PCReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.shutdown();
    }

}
