package com.raven.example.dp.behavioral.command.ex1.tv;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * TV[上]命令
 */
public class PreviousCommand implements NoParamCommand {

    private final TVReceiver receiver;

    public PreviousCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.previous();
    }

}
