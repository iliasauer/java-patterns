package com.company.learn.javapatterns.strategy.duck.impl.behavior;

import com.company.learn.javapatterns.strategy.duck.api.behavior.SwimBehavior;

/**
 Created on 10.09.16.
 */
public class SwimNoWay implements SwimBehavior {

	@Override
	public void swim() {
		System.out.println();
	}
}
