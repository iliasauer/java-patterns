package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface StylizedPizza extends Pizza, Stylized<StylizedPizza.PizzaStyle> {

	enum PizzaStyle {
		NEW_YORK {
			@Override
			public String toString() {
				return "New York";
			}
		},
		CHICAGO {
			@Override
			public String toString() {
				return "Chicago";
			}
		}
	}

}
