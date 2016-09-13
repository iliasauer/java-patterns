package com.company.learn.javapatterns.decorator.beverage.impl;

import com.company.learn.javapatterns.decorator.beverage.api.BeverageBasis;

/**
 * Created by on 9/13/2016.
 */
public class HouseBlend implements BeverageBasis {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
