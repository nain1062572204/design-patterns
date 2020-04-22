package com.wang;

/**
 * @author 王念
 * @create 2019-11-05 22:06
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .33 + beverage.cost();
    }
}
