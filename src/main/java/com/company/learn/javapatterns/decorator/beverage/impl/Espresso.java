package com.company.learn.javapatterns.decorator.beverage.impl;

import com.company.learn.javapatterns.decorator.beverage.api.BeverageBasis;

/**
 * Created by on 9/13/2016.
 */
public class Espresso implements BeverageBasis {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
