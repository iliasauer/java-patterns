package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.StylizedPizza;

/**
 Created on 21.09.16.
 */
public class SimpleStylizedPizza extends SimplePizza implements StylizedPizza {

	private final Enum<PizzaStyle> style;

	public SimpleStylizedPizza(final Enum<PizzaType> type, final Enum<PizzaStyle> style) {
		super(type);
		this.style = style;
	}

	@Override
	protected String describeAction(final String action) {
		return super.describeAction(action) + " in " + style.toString() + " style";
	}

	@Override
	public Enum<PizzaStyle> style() {
		return style;
	}
}
