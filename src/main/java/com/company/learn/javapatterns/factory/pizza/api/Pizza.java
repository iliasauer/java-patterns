package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 20.09.16.
 */
public interface Pizza extends Typed<Pizza.PizzaType> {

	void prepare();

	void make();

	void cut();

	void box();

	enum PizzaType {
		CHEESE, PEPPERONI, CLAM, VEGGIE
	}

}
