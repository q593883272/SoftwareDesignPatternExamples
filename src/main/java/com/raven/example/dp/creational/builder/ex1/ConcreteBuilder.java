package com.raven.example.dp.creational.builder.ex1;

/**
 * 建造者实现
 *
 * @author Raven 2017年4月10日
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Builder buildName(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public Builder buildPrice(int price) {
        product.setPrice(price);
        return this;
    }

    @Override
    public Builder buildWeight(int weight) {
        product.setWeight(weight);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
