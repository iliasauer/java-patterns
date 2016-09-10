package com.company.learn.javapatterns.strategy.duck.impl;

import com.company.learn.javapatterns.strategy.duck.api.DisplayableDuck;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.NaturalFly;
import com.company.learn.javapatterns.strategy.duck.impl.behavior.Quack;

/**
 Created on 10.09.16.
 */
public class MallardDuck extends BasicDuck implements DisplayableDuck {

	public MallardDuck() {
		super(new NaturalFly(), new Quack());
	}

}
