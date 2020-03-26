package com.raven.example.dp.behavioral.command.ex2;

import com.raven.example.dp.behavioral.command.ex2.pc.BootCommand;
import com.raven.example.dp.behavioral.command.ex2.pc.PCReceiver;
import com.raven.example.dp.behavioral.command.ex2.pc.PlayGameCommand;
import com.raven.example.dp.behavioral.command.ex2.pc.ShutdownCommand;
import com.raven.example.dp.behavioral.command.ex2.phone.CallCommand;
import com.raven.example.dp.behavioral.command.ex2.phone.OffCommand;
import com.raven.example.dp.behavioral.command.ex2.phone.OnCommand;
import com.raven.example.dp.behavioral.command.ex2.phone.PhoneReceiver;
import com.raven.example.dp.behavioral.command.ex2.tv.*;

/**
 * 命令模式(宏命令/组合命令)
 *
 * @author Raven 2016年9月21日
 */
public class TestRun {

    public static void main(String[] args) {

        Broker broker = new Broker();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Phone <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        PhoneReceiver phoneReceiver = new PhoneReceiver();
        broker.takeCommand(new OnCommand(phoneReceiver));
        broker.takeCommand(new CallCommand(phoneReceiver), "110");
        broker.takeCommand(new OffCommand(phoneReceiver));
        broker.placeCommands();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PC <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        PCReceiver pcReceiver = new PCReceiver();
        broker.takeCommand(new BootCommand(pcReceiver));
        broker.takeCommand(new PlayGameCommand(pcReceiver));
        broker.takeCommand(new ShutdownCommand(pcReceiver));
        broker.placeCommands();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TV <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        TVReceiver tvReceiver = new TVReceiver();
        broker.takeCommand(new OpenCommand(tvReceiver));
        broker.takeCommand(new NextCommand(tvReceiver));
        broker.takeCommand(new PreviousCommand(tvReceiver));
        broker.takeCommand(new CloseCommand(tvReceiver));
        broker.placeCommands();

    }
}
