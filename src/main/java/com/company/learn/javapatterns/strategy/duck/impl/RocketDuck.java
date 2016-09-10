package com.company.learn.javapatterns.strategy.duck.impl;

import com.company.learn.javapatterns.strategy.duck.api.DisplayableDuck;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.Quack;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.RocketPoweredFly;

/**
 Created on 10.09.16.
 */
public class RocketDuck extends BasicDuck implements DisplayableDuck {
	
	public RocketDuck() {
		super(new RocketPoweredFly(), new Quack());
	}
}
