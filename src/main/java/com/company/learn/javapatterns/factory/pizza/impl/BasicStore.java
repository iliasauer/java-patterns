package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Factory;
import com.company.learn.javapatterns.factory.pizza.api.Store;
import com.company.learn.javapatterns.factory.pizza.api.Typed;

/**
 Created on 21.09.16.
 */
public class BasicStore<T extends Typed<E>, E extends Enum<E>> implements Store<T, E> {

	private final Factory<T, E> factory;

	public BasicStore(final Factory<T, E> factory) {
		this.factory = factory;
	}

	@Override
	public T order(final Enum<E> type) {
		return factory.create(type);
	}
}
