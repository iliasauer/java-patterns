package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Pizza;

/**
 Created on 21.09.16.
 */
public class BasicPizza implements Pizza {

	private final PizzaType type;
	private final String typeString;

	public BasicPizza(final PizzaType type) {
		this.type = type;
		final String temp = type.toString();
		this.typeString = Character.toUpperCase(temp.charAt(0)) + temp.substring(1).toLowerCase();
	}

	@Override
	public void prepare() {
		System.out.println(typeString + " pizza is being prepared");
	}

	@Override
	public void make() {
		System.out.println(typeString + " pizza is being made");
	}

	@Override
	public void cut() {
		System.out.println(typeString + " pizza is being cut");
	}

	@Override
	public void box() {
		System.out.println(typeString + " pizza is being boxed");
	}

	@Override
	public PizzaType type() {
		return type;
	}
}
