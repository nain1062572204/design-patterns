package com.wang.myinterface.impl;

import com.wang.myinterface.MyInterface;

/**
 * @author 王念
 * @create 2019-11-11 21:41
 */
public class SimpleProxy implements MyInterface {
    private MyInterface proxied;

    public SimpleProxy(MyInterface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse" + arg);
        proxied.somethingElse(arg);
    }
}
