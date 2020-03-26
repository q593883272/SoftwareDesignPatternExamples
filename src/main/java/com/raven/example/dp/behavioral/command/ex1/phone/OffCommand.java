package com.raven.example.dp.behavioral.command.ex1.phone;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * 电话[打开]命令
 */
public class OffCommand implements NoParamCommand {

    private final PhoneReceiver receiver;

    public OffCommand(PhoneReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

}
