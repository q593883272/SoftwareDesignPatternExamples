package com.raven.example.dp.behavioral.mediator;

/**
 * 同事类
 * 每一个同事类都知道它的中介者对象
 * 每一个同对象在需与其他的同事通信的时候,与它的中介者通信.
 *
 * @author Raven 2017年11月15日
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.createColleague(this);
    }

    protected void changed() {
        mediator.operation(this);
    }
}
