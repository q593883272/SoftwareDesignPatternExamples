package com.raven.example.dp.behavioral.command.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 命令执行者
 */
public final class Broker {

    private List<Order> commandOrderList = new ArrayList<>();

    public void takeCommand(Command command) {
        commandOrderList.add(new Order<>(command, null));
    }

    public <T> void takeCommand(Command command, T param) {
        commandOrderList.add(new Order<>(command, param));
    }

    public void placeCommands() {
        Iterator<Order> iterator = commandOrderList.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            Command command = order.getCommand();
            if (command instanceof ParamCommand) {
                ((ParamCommand) command).execute(order.getParam());
            } else if (command instanceof NoParamCommand) {
                ((NoParamCommand) command).execute();
            } else {
                throw new IllegalArgumentException("Not Command Type");
            }
            iterator.remove();
        }
    }

    private static class Order<T> {

        private final Command command;
        private final T param;

        public Order(Command command, T param) {
            this.command = command;
            this.param = param;
        }

        public Command getCommand() {
            return command;
        }

        public T getParam() {
            return param;
        }
    }

}
