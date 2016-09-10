package com.company.learn.javapatterns.strategy.duck.impl;

import com.company.learn.javapatterns.strategy.duck.api.DisplayableDuck;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.FlyNoWay;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.Quack;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.SwimNoWay;

/**
 Created on 10.09.16.
 */
public class DecoyDuck extends BasicDuck implements DisplayableDuck {

	public DecoyDuck() {
		super(new FlyNoWay(), new Quack(), new SwimNoWay());
	}
}
