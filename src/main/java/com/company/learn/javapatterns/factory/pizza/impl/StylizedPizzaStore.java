package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Pizza;
import com.company.learn.javapatterns.factory.pizza.api.StylizedPizza;

/**
 Created on 21.09.16.
 */
public class StylizedPizzaStore
	extends BasicStylizedStore<
	StylizedPizza, Pizza.PizzaType, StylizedPizza.PizzaStyle
	> {
	
	public StylizedPizzaStore() {
		super(new SimpleStylizedPizzaFactory());
	}

	@Override
	public StylizedPizza order(
		final Enum<Pizza.PizzaType> type, final Enum<StylizedPizza.PizzaStyle> style
	) {
		final StylizedPizza pizza = super.order(type, style);
		pizza.prepare();
		pizza.make();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
