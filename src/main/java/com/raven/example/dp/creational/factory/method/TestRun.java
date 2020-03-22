package com.raven.example.dp.creational.factory.method;

/**
 * 工厂方法模式(Factory Method Pattern)又称为工厂模式，
 * 也叫虚拟构造器(Virtual Constructor)模式或者多态工厂(Polymorphic Factory)模式，它属于类创建型模式。
 * 在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，
 * 而工厂子类则负责生成具体的产品对象，这样做的目的是将产品类的实例化操作延迟到工厂子类中完成，
 * 即通过工厂子类来确定究竟应该实例化哪一个具体产品类。
 *
 * @author Raven 2017年4月10日
 */
public class TestRun {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct("手机");
        product.use();
    }

}
