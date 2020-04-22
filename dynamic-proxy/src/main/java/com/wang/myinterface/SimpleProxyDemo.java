package com.wang.myinterface;

import com.wang.myinterface.impl.RealObject;
import com.wang.myinterface.impl.SimpleProxy;

/**
 * @author 王念
 * @create 2019-11-11 21:43
 */
public class SimpleProxyDemo {
    public static void consumer(MyInterface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
