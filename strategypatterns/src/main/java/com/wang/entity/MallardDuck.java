package com.wang.entity;

import com.wang.dao.impl.FlyWithWings;
import com.wang.dao.impl.Quack;

/**
 * @author 王念
 * @create 2019-11-03 13:38
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭，不会飞!");
    }
}
