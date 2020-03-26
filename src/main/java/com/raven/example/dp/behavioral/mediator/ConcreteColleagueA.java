package com.raven.example.dp.behavioral.mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void setText(String string) {
        System.out.println("Text:" + string);
    }
}
