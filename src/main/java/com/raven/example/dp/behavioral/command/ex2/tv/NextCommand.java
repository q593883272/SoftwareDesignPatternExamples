package com.raven.example.dp.behavioral.command.ex2.tv;

import com.raven.example.dp.behavioral.command.ex2.NoParamCommand;

/**
 * TV[下]命令
 */
public class NextCommand implements NoParamCommand {

    private final TVReceiver receiver;

    public NextCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.next();
    }

}
