package com.raven.example.dp.structural.adapter.ex2;

/**
 * 适配者
 */
public interface Adaptee {

    /**
     * 数据库名称
     */
    String dataBaseName();

    /**
     * 连接数据库
     */
    void connect() throws Exception;

    /**
     * 关闭连接据库
     */
    void close() throws Exception;


}
