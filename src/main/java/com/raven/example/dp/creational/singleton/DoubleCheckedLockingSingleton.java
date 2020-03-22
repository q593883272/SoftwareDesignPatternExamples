package com.raven.example.dp.creational.singleton;

/**
 * 双重锁
 *
 * @author Raven 2017年4月10日
 */
public class DoubleCheckedLockingSingleton {

    private static DoubleCheckedLockingSingleton singleton = null;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
