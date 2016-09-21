package com.company.learn.javapatterns.factory.pizza.api;

import com.company.learn.javapatterns.factory.pizza.impl.PizzaStore;
import org.junit.Before;
import org.junit.Test;

/**
 Created on 21.09.16.
 */
public class StoreTest {

	private Store<Pizza, Pizza.PizzaType> store;

	@Before
	public void setUp() throws Exception {
		store = new PizzaStore();
	}

	@Test
	public void shouldOrderPizza() throws Exception {
		for (Enum<Pizza.PizzaType> each: Pizza.PizzaType.values()) {
			store.order(each);
		}
	}
}