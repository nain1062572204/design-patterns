package com.wang.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 王念
 * @create 2019-11-22 13:53
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Prepare" + name);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tossing dough...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Adding toppings...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 m at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
