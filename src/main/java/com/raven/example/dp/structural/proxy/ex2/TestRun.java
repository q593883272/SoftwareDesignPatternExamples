package com.raven.example.dp.structural.proxy.ex2;


import java.lang.reflect.Proxy;

/**
 * 代理模式 (JDK动态代理)
 *
 * @author Raven 2017年5月31日
 */
public class TestRun {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationSubject handle = new InvocationSubject(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handle);
        proxy.request();
    }

}
