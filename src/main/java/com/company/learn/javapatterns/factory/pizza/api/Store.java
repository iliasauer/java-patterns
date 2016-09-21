package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface Store<T extends Typed<E>, E extends Enum<E>> {

	T order(final Enum<E> type);

}
