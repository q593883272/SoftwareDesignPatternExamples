package com.raven.example.dp.creational.factory.method;

/**
 * 具体产品
 *
 * @author Raven 2017年4月10日
 */
public class ConcreteProduct implements Product {

    private String productName;

    public ConcreteProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public String name() {
        return productName;
    }

    @Override
    public void use() {
        System.out.println("使用" + productName + "!");
    }

}
