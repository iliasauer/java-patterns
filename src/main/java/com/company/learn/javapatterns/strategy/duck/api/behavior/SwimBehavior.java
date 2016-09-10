package com.company.learn.javapatterns.strategy.duck.api.behavior;

/**
 Created on 10.09.16.
 */
public interface SwimBehavior {

	default void swim() {
		System.out.println("*swim for a while*");
	}

}
