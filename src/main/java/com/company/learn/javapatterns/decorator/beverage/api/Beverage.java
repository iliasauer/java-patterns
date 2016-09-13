package com.company.learn.javapatterns.decorator.beverage.api;

/**
 * Created by on 9/13/2016.
 */
public interface Beverage {

    String getDescription();

    double cost();

    static String info(final Beverage beverage) {
        return beverage.getDescription() +
                " $" + (beverage.cost() * 100d) / 100d;
    }
}
