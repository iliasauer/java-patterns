package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Factory;
import com.company.learn.javapatterns.factory.pizza.api.Pizza;
import com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType;

/**
 Created on 21.09.16.
 */
public class SimplePizzaFactory implements Factory<Pizza, PizzaType> {

	@Override
	public Pizza create(final Enum<PizzaType> type) {
		return new SimplePizza(type);
	}
}
