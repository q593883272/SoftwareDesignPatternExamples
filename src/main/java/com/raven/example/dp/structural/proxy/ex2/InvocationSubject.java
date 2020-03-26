package com.raven.example.dp.structural.proxy.ex2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationSubject implements InvocationHandler {

    private Object target;

    public InvocationSubject(Object target) {
        this.target = target;
    }

    private void before() {
        System.out.println("Proxy before");
    }

    private void after() {
        System.out.println("Proxy after");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }
}
