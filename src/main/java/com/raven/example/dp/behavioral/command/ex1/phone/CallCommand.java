package com.raven.example.dp.behavioral.command.ex1.phone;

import com.raven.example.dp.behavioral.command.ex1.Command;
import com.raven.example.dp.behavioral.command.ex1.ParamCommand;

/**
 * 电话[呼叫]命令
 */
public class CallCommand implements ParamCommand<String> {

    private final PhoneReceiver receiver;

    public CallCommand(PhoneReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String param) {
        receiver.call(param);
    }

}
