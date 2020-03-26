package com.raven.example.dp.behavioral.command.ex1.pc;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * PC[开机]命令
 */
public class BootCommand implements NoParamCommand {

    private final PCReceiver receiver;

    public BootCommand(PCReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.boot();
    }

}
