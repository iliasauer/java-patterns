package com.company.learn.javapatterns.strategy.duck.impl.behavior;

import com.company.learn.javapatterns.strategy.duck.api.behavior.FlyBehavior;

/**
 Created on 10.09.16.
 */
public class NaturalFly implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("I fly with my wings!");
	}
}
