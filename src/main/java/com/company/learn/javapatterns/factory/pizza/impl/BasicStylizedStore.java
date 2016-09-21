package com.company.learn.javapatterns.factory.pizza.impl;

import com.company.learn.javapatterns.factory.pizza.api.Stylized;
import com.company.learn.javapatterns.factory.pizza.api.StylizedFactory;
import com.company.learn.javapatterns.factory.pizza.api.StylizedStore;
import com.company.learn.javapatterns.factory.pizza.api.Typed;

/**
 Created on 21.09.16.
 */
public class BasicStylizedStore<
	T extends Typed<E> & Stylized<S>, E extends Enum<E>, S extends Enum<S>
	> implements StylizedStore<T, E, S> {

	private final StylizedFactory<T, E, S> factory;

	public BasicStylizedStore(final StylizedFactory<T, E, S> factory) {
		this.factory = factory;
	}

	@Override
	public T order(final Enum<E> type, final Enum<S> style) {
		return factory.create(type, style);
	}
}
