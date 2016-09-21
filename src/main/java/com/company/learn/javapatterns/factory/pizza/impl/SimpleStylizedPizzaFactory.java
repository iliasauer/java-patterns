package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Pizza;
import com.company.learn.javapatterns.factory.pizza.api.StylizedFactory;
import com.company.learn.javapatterns.factory.pizza.api.StylizedPizza;

/**
 Created on 21.09.16.
 */
public class SimpleStylizedPizzaFactory
	implements StylizedFactory<
	StylizedPizza, Pizza.PizzaType, StylizedPizza.PizzaStyle
	> {
	
	@Override
	public StylizedPizza create(
		final Enum<Pizza.PizzaType> type, final Enum<StylizedPizza.PizzaStyle> style
	) {
		return new SimpleStylizedPizza(type, style);
	}
}
