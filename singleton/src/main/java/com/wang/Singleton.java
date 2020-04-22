package com.wang;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 王念
 * @create 2019-11-07 10:51
 */
public class Singleton {
    private static final String DESC = "我是独一无二的";
    private static final ReentrantLock LOCK = new ReentrantLock();

    private volatile static Singleton instance = null;

    public String getDESC() {
        return DESC;
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            try {
                LOCK.lock();
                if (instance == null)
                    instance = new Singleton();
            } finally {
                LOCK.unlock();
            }
        }
        return instance;
    }
}
