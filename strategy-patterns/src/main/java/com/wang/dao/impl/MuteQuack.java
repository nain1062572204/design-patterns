package com.wang.dao.impl;

import com.wang.dao.QuackBehavior;

/**
 * @author 王念
 * @create 2019-11-03 13:35
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence  >>");
    }
}
