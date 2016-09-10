package com.company.learn.javapatterns.strategy.duck.impl.behavior;

import com.company.learn.javapatterns.strategy.duck.api.behavior.SoundBehavior;

/**
 Created on 10.09.16.
 */
public class MuteSound implements SoundBehavior {
	
	@Override
	public void makeSound() {
		System.out.println();
	}
}
