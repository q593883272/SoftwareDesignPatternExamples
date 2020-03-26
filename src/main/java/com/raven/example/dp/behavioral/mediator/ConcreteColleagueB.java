package com.raven.example.dp.behavioral.mediator;

public class ConcreteColleagueB extends Colleague {
	
	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}
	
	public boolean isOk(boolean ok) {
		System.out.println(ok);
		return ok;
	}
}
