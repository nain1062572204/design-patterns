package com.wang.myinterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 王念
 * @create 2019-11-11 21:46
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*******proxy:" + proxy.getClass() + ",method:" + method + ",args:" + Arrays.toString(args));
        return method.invoke(proxied, args);
    }
}
