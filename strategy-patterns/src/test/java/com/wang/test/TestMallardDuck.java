package com.wang.test;

import com.wang.entity.MallardDuck;
import org.junit.Test;

/**
 * @author 王念
 * @create 2019-11-03 13:42
 */
public class TestMallardDuck {
    @Test
    public void test() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
