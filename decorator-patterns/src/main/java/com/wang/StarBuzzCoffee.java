package com.wang;

/**
 * @author 王念
 * @create 2019-11-05 22:07
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        Beverage beverage1 = new Espresso();
        Mocha mocha = new Mocha(beverage1);
        System.out.println(mocha.getDescription() + "$" + mocha.cost());
        Whip whip = new Whip(mocha);
        System.out.println(whip.getDescription() + "$" + whip.cost());
    }
}
