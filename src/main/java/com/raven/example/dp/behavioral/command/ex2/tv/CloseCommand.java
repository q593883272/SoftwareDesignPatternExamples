package com.raven.example.dp.behavioral.command.ex2.tv;

import com.raven.example.dp.behavioral.command.ex2.NoParamCommand;

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
