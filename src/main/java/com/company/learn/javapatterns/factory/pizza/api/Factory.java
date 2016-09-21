package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface Factory<T extends Typed<E>, E extends Enum<E>> {

	T create(final Enum<E> type);
	
}
