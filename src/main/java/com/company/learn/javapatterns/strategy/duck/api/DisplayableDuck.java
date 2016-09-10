package com.company.learn.javapatterns.strategy.duck.api;

import com.company.learn.javapatterns.common.Displayable;

/**
 Created on 10.09.16.
 */
public interface DisplayableDuck extends Duck, Displayable {

	@Override
	default void display() {
		System.out.println("Hi! I'm " + species() + ".");
		performMakingSound();
		performSwim();
		performFly();
	}
}
