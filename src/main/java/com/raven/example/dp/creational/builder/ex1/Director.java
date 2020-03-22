package com.raven.example.dp.creational.builder.ex1;

/**
 * 指挥者
 * 
 * @author Raven 2017年4月10日
 */
public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product construct(){
		return builder.buildName("xxx").buildPrice(21).buildWeight(18).build();
	}
}
