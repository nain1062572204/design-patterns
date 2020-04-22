package com.wang.entity;

import com.wang.dao.impl.FlyNoWay;
import com.wang.dao.impl.Quack;

/**
 * @author 王念
 * @create 2019-11-03 14:30
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("我是模型鸭");
    }
}
