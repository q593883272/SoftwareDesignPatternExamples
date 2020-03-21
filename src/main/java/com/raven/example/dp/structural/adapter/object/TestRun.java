package com.raven.example.dp.structural.adapter.object;

import com.raven.example.dp.structural.adapter.object.adaptee.MySqlAdaptee;
import com.raven.example.dp.structural.adapter.object.adaptee.OracleAdaptee;

/**
 * 对象适配器
 *
 * @author Raven 2017年5月29日
 */
public class TestRun {

    public static void main(String[] args) throws Exception {
        Target adapter = new Adapter(new OracleAdaptee());
        adapter.connection();
        System.out.println("操作数据库中...");
        Thread.sleep(5000L);
        adapter.exit();
    }
}
