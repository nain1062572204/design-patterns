package com.wang.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 王念
 * @create 2019-11-08 15:46
 */
public class EvenGenerator extends IntGenerator {
    private volatile int currentValue = 0;
    private Lock lock = new ReentrantLock();

    /*public synchronized int next() {
        ++currentValue;
        Thread.yield();
        ++currentValue;
        return currentValue;
    }*/
    /*public int next() {
        lock.lock();
        try {
            ++currentValue;
            Thread.yield();
            ++currentValue;
            return currentValue;
        } finally {
            lock.unlock();
        }
    }*/
    public int next(){
        synchronized (this){
            ++currentValue;
            Thread.yield();
            ++currentValue;
            return currentValue;
        }
    }


    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }


}
