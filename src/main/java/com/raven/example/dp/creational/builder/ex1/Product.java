package com.raven.example.dp.creational.builder.ex1;

/**
 * 产品
 *
 * @author Raven 2017年4月10日
 */
public class Product {

    private String name;
    private int price;
    private int weight;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[产品名=" + name + ", 价格=" + price + ", 重量=" + weight + "]";
    }

}
