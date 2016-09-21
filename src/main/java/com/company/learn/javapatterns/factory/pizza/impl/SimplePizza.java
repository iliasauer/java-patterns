package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Pizza;

/**
 Created on 21.09.16.
 */
public class SimplePizza
	implements Pizza {

	private final Enum<PizzaType> type;
	private final String typeString;

	public SimplePizza(final Enum<PizzaType> type) {
		this.type = type;
		this.typeString = type.toString();
	}

	@Override
	public void prepare() {
		System.out.println(describeAction("prepared"));
	}

	@Override
	public void make() {
		System.out.println(describeAction("made"));
	}

	@Override
	public void cut() {
		System.out.println(describeAction("cut"));
	}

	@Override
	public void box() {
		System.out.println(describeAction("boxed"));
	}

	protected String describeAction(final String action) {
		return typeString + " pizza is being " + action;
	}

	@Override
	public Enum<PizzaType> type() {
		return type;
	}

	@Override
	public String toString() {
		return typeString;
	}
}
