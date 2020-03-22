package com.raven.example.dp.creational.builder.ex2;

public class Product {

    private String name;
    private int price;
    private int weight;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "[产品名=" + name + ", 价格=" + price + ", 重量=" + weight + "]";
    }

    public static class Builder {

        private String name;
        private int price;
        private int weight;

        public Builder() {
        }

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder buildWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
