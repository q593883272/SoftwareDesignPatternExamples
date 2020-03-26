package com.raven.example.dp.behavioral.command.ex2;

public interface ParamCommand<T> extends Command {

    /**
     * 命令执行
     */
    void execute(T param);

}
