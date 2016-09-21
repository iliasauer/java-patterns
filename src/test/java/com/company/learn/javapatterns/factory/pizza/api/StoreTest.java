package com.company.learn.javapatterns.factory.pizza.api;

import com.company.learn.javapatterns.factory.pizza.impl.StylizedPizzaStore;
import org.junit.Before;
import org.junit.Test;

/**
 Created on 21.09.16.
 */
public class StoreTest {

	private StylizedStore<StylizedPizza, Pizza.PizzaType, StylizedPizza.PizzaStyle> store;

	@Before
	public void setUp() throws Exception {
		store = new StylizedPizzaStore();
	}

	@Test
	public void shouldOrderPizza() throws Exception {
		for (final Enum<Pizza.PizzaType> type: Pizza.PizzaType.values()) {
			for (final Enum<StylizedPizza.PizzaStyle> style: StylizedPizza.PizzaStyle.values()) {
				store.order(type, style);
			}
		}
	}
}