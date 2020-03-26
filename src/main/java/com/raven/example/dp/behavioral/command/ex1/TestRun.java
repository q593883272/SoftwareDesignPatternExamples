package com.raven.example.dp.behavioral.command.ex1;

import com.raven.example.dp.behavioral.command.ex1.pc.BootCommand;
import com.raven.example.dp.behavioral.command.ex1.pc.PCReceiver;
import com.raven.example.dp.behavioral.command.ex1.pc.PlayGameCommand;
import com.raven.example.dp.behavioral.command.ex1.pc.ShutdownCommand;
import com.raven.example.dp.behavioral.command.ex1.phone.CallCommand;
import com.raven.example.dp.behavioral.command.ex1.phone.OffCommand;
import com.raven.example.dp.behavioral.command.ex1.phone.OnCommand;
import com.raven.example.dp.behavioral.command.ex1.phone.PhoneReceiver;
import com.raven.example.dp.behavioral.command.ex1.tv.*;

/**
 * 命令模式
 * 将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 *
 * @author Raven 2016年9月21日
 */
public class TestRun {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Phone <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        PhoneReceiver phoneReceiver = new PhoneReceiver();
        invoker.setCommand(new OnCommand(phoneReceiver)).call();
        invoker.setCommand(new CallCommand(phoneReceiver)).call("110");
        invoker.setCommand(new OffCommand(phoneReceiver)).call();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PC <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        PCReceiver pcReceiver = new PCReceiver();
        invoker.setCommand(new BootCommand(pcReceiver)).call();
        invoker.setCommand(new PlayGameCommand(pcReceiver)).call();
        invoker.setCommand(new ShutdownCommand(pcReceiver)).call();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TV <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        TVReceiver tvReceiver = new TVReceiver();
        invoker.setCommand(new OpenCommand(tvReceiver)).call();
        invoker.setCommand(new NextCommand(tvReceiver)).call();
        invoker.setCommand(new PreviousCommand(tvReceiver)).call();
        invoker.setCommand(new CloseCommand(tvReceiver)).call();

    }
}
