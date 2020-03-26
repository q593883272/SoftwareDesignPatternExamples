package com.raven.example.dp.behavioral.command.ex1;

/**
 * 命令消费者
 */
public class Invoker {

    private Command command;

    public Invoker setCommand(Command command) {
        this.command = command;
        return this;
    }

    public void call() {
        if (command instanceof NoParamCommand) {
            ((NoParamCommand) command).execute();
        } else {
            throw new IllegalArgumentException("Not NoParamCommand Type");
        }

    }

    public <T> void call(T param) {
        if (command instanceof ParamCommand) {
            ((ParamCommand) command).execute(param);
        } else {
            throw new IllegalArgumentException("Not ParamCommand Type");
        }
    }

}
