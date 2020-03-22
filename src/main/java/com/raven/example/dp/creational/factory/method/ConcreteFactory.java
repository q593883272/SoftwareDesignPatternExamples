package com.raven.example.dp.creational.factory.method;

/**
 * 具体工厂
 * 
 * @author Raven 2017年4月10日
 */
public class ConcreteFactory implements Factory {

	@Override
	public Product createProduct(String productName) {
		return new ConcreteProduct(productName);
	}

}
