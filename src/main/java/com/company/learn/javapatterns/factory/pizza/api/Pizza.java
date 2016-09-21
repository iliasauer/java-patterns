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
		CHEESE, PEPPERONI, CLAM, VEGGIE;

		@Override
		public String toString() {
			final String temp = super.toString();
			return Character.toUpperCase(temp.charAt(0)) + temp.substring(1).toLowerCase();
		}
	}

}
