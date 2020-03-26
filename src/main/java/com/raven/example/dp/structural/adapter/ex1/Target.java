package com.raven.example.dp.structural.adapter.ex1;

/**
 * 目标抽象类
 */
public interface Target {

    /**
     * 数据库类型
     */
    String getDataBaseType();

    /**
     * 连接
     */
    void connection() throws Exception;

    /**
     * 退出
     */
    void exit() throws Exception;

}
