package com.wang.myinterface;

import com.wang.myinterface.impl.RealObject;

import java.lang.reflect.Proxy;

/**
 * @author 王念
 * @create 2019-11-11 21:51
 */
public class SimpleDynamicProxy {
    public static void consumer(MyInterface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
