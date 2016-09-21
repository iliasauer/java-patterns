package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Factory;
import com.company.learn.javapatterns.factory.pizza.api.Pizza;
import com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType;

import static com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType.CHEESE;
import static com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType.CLAM;
import static com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType.PEPPERONI;
import static com.company.learn.javapatterns.factory.pizza.api.Pizza.PizzaType.VEGGIE;

/**
 Created on 21.09.16.
 */
public class SimplePizzaFactory implements Factory<Pizza, PizzaType> {

	@Override
	public Pizza create(final Enum<PizzaType> type) {
		if (type.equals(CHEESE)) {
			return new CheesePizza();
		} else if (type.equals(PEPPERONI)) {
			return new PepperoniPizza();
		} else if (type.equals(CLAM)) {
			return new ClamPizza();
		} else if (type.equals(VEGGIE)) {
			return new VeggiePizza();
		}
		return null;
	}
}
