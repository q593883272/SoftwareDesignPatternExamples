package com.raven.example.dp.behavioral.mediator;

/**
 * 具体中介者 具体中介者通过协调各个同事对象实现协作行为,并了解并维护它的各个同事
 *
 * @author Raven 2017年11月15日
 */
public class ConcreteMediator extends Mediator {

    @Override
    void operation(Colleague c) {
        if (!colleagues.contains(c)) return;
        if (c instanceof ConcreteColleagueA) {
            ((ConcreteColleagueA) colleagues.get(colleagues.indexOf(c))).setText("动作变化");
        } else if (c instanceof ConcreteColleagueB) {
            ((ConcreteColleagueB) colleagues.get(colleagues.indexOf(c))).isOk(true);
        }
    }

}
