package com.raven.example.dp.creational.singleton;

/**
 * 饿汉式
 * 
 * @author Raven 2017年4月10日
 */
public class HungrySingleton {

	private static HungrySingleton singleton = new HungrySingleton();

	private HungrySingleton() {}

	public static HungrySingleton getSingleton() {
		return singleton;
	}
}
