package com.raven.example.dp.creational.singleton;

/**
 * 懒汉式
 * 
 * @author Raven 2017年4月10日
 */
public class LazySingleton {

	private static LazySingleton singleton = null;

	private LazySingleton() {}

	public static LazySingleton getSingleton() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
