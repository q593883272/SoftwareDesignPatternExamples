package com.raven.example.dp.behavioral.command.ex1.tv;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * TV[关闭]命令
 */
public class CloseCommand implements NoParamCommand {

    private final TVReceiver receiver;

    public CloseCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.close();
    }

}
