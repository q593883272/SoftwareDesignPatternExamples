package com.raven.example.dp.behavioral.command.ex1.phone;

import com.raven.example.dp.behavioral.command.ex1.NoParamCommand;

/**
 * 电话[关闭]命令
 */
public class OnCommand implements NoParamCommand {

    private final PhoneReceiver receiver;

    public OnCommand(PhoneReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

}
