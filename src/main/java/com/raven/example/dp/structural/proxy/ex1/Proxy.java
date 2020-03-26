package com.raven.example.dp.structural.proxy.ex1;

public class Proxy {

    private Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    private void before() {
        System.out.println("Proxy before");
    }

    private void after() {
        System.out.println("Proxy after");
    }

    public void proxy() {
        before();
        subject.request();
        after();
    }
}
