package com.company.learn.javapatterns.decorator.beverage.impl;

import com.company.learn.javapatterns.decorator.beverage.api.BeverageCondiment;
import com.company.learn.javapatterns.decorator.beverage.api.Beverage;

/**
 * Created by on 9/13/2016.
 */
public class Whip implements BeverageCondiment {

    private Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
