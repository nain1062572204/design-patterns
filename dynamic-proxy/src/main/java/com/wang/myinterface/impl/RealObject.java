package com.wang.myinterface.impl;

import com.wang.myinterface.MyInterface;

/**
 * @author 王念
 * @create 2019-11-11 21:40
 */
public class RealObject implements MyInterface {
    public void doSomething() {
        System.out.println("doSomething");
    }

    public void somethingElse(String arg) {
        System.out.println("something" + arg);

    }
}
