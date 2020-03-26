package com.raven.example.dp.behavioral.mediator;


/**
 * 中介者模式
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 中介者模式又称为调停者模式，它是一种对象行为型模式。
 *
 * @author Raven 2015年6月7日
 */
public class TestRun {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague cA = new ConcreteColleagueA(mediator);
        Colleague cB = new ConcreteColleagueB(mediator);
        cA.changed();
        cB.changed();
    }

}
