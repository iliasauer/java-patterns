package com.company.learn.javapatterns.decorator.beverage.impl;

import com.company.learn.javapatterns.decorator.beverage.api.BeverageBasis;

/**
 * Created by on 9/13/2016.
 */
public class DarkRoast implements BeverageBasis {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.29;
    }
}
