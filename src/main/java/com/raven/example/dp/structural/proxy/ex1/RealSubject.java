package com.raven.example.dp.structural.proxy.ex1;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("Proxy: " + this.getClass().getName());
	}
	
}
