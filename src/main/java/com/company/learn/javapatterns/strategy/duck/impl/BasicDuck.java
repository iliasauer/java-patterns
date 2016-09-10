package com.company.learn.javapatterns.strategy.duck.impl;

import com.company.learn.javapatterns.strategy.duck.api.Duck;
import com.company.learn.javapatterns.strategy.duck.api.behavior.FlyBehavior;
import com.company.learn.javapatterns.strategy.duck.api.behavior.SoundBehavior;
import com.company.learn.javapatterns.strategy.duck.api.behavior.SwimBehavior;

/**
 Created on 10.09.16.
 */
public class BasicDuck
	implements Duck {

	private final FlyBehavior flyBehavior;
	private final SoundBehavior soundBehavior;
	private final SwimBehavior swimBehavior;
	private final String species;

	public BasicDuck(final FlyBehavior flyBehavior, final SoundBehavior soundBehavior) {
		this(flyBehavior, soundBehavior, new SwimBehavior() {});
	}

	public BasicDuck(
		final FlyBehavior flyBehavior, final SoundBehavior soundBehavior,
		final SwimBehavior swimBehavior
	) {
		this.flyBehavior = flyBehavior;
		this.soundBehavior = soundBehavior;
		this.swimBehavior = swimBehavior;
		this.species = getClass().getSimpleName();
	}

	@Override
	public void performFly() {
		flyBehavior.fly();
	}

	@Override
	public void performMakingSound() {
		soundBehavior.makeSound();
	}

	@Override
	public void performSwim() {
		swimBehavior.swim();
	}

	@Override
	public String species() {
		return species;
	}
}
