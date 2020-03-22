package com.raven.example.dp.structural.adapter.object;

/**
 * 适配器类
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getDataBaseType() {
        return adaptee.dataBaseName();
    }

    @Override
    public void connection() throws Exception {
        adaptee.connect();
    }

    @Override
    public void exit() throws Exception {
        adaptee.close();
    }

}
