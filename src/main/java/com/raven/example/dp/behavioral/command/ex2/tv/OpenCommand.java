package com.raven.example.dp.behavioral.command.ex2.tv;

import com.raven.example.dp.behavioral.command.ex2.NoParamCommand;

/**
 * TV[打开]命令
 */
public class OpenCommand implements NoParamCommand {

    private final TVReceiver receiver;

    public OpenCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.open();
    }

}
