package com.company.learn.javapatterns.strategy.duck.api;

import com.company.learn.javapatterns.strategy.duck.api.ability.Swimmable;

/**
 Created on 10.09.16.
 */
public interface Duck {

	void performFly();

	void performMakingSound();

	void performSwim();

	String species();

}
