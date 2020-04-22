package com.wang.dao.impl;

import com.wang.dao.FlyBehavior;

/**
 * @author 王念
 * @create 2019-11-03 13:34
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("我不会飞");
    }
}
