package com.wang.dao.impl;

import com.wang.dao.QuackBehavior;

/**
 * @author 王念
 * @create 2019-11-03 13:34
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱叫");
    }
}
