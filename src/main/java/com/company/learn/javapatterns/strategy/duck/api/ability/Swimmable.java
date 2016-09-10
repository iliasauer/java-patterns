package com.company.learn.javapatterns.strategy.duck.api.ability;

/**
 Created on 10.09.16.
 */
public interface Swimmable {

	default void swim() {
		System.out.println("*swim for a while*");
	}

}
