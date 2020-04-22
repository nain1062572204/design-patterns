package com.wang.store;

import com.wang.entity.Pizza;

/**
 * @author 王念
 * @create 2019-11-22 14:07
 */
public abstract class PizzaStore {
    protected Pizza pizza;
    protected abstract Pizza createPizza(String type);
}
