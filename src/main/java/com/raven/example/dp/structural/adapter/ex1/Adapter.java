package com.raven.example.dp.structural.adapter.ex1;

import com.raven.example.dp.structural.adapter.ex1.adaptee.MySqlAdaptee;

public class Adapter extends MySqlAdaptee implements Target {

    @Override
    public String getDataBaseType() {
        return dataBaseName();
    }

    @Override
    public void connection() throws Exception {
        connect();
    }

    @Override
    public void exit() throws Exception {
        close();
    }


}
