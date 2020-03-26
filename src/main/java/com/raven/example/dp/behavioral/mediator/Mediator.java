package com.raven.example.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者
 * 中介者定义一个接口用于与各同事对象通讯
 *
 * @author Raven 2017年11月15日
 */
public abstract class Mediator {

    protected List<Colleague> colleagues;

    public Mediator() {
        colleagues = new ArrayList<>();
    }

    protected void createColleague(Colleague c) {
        colleagues.add(c);
    }

    abstract void operation(Colleague c);
}
