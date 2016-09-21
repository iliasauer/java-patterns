package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Pizza;

/**
 Created on 21.09.16.
 */
public class PizzaStore extends BasicStore<Pizza, Pizza.PizzaType> {

	public PizzaStore() {
		super(new SimplePizzaFactory());
	}

	@Override
	public Pizza order(final Enum<Pizza.PizzaType> type) {
		final Pizza pizza = super.order(type);
		pizza.prepare();
		pizza.make();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
