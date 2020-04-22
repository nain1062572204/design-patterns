package com.wang.store;

import com.wang.entity.NYStyleCheesePizza;
import com.wang.entity.Pizza;

/**
 * @author 王念
 * @create 2019-11-22 14:08
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals(PizzaType.CHEESE))
            return new NYStyleCheesePizza();
        return null;
    }
}
