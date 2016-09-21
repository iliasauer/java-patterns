package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface StylizedStore<
	T extends Typed<E> & Stylized<S>,
	E extends Enum<E>,
	S extends Enum<S>
	> {

	T order(final Enum<E> type, final Enum<S> style);

}
