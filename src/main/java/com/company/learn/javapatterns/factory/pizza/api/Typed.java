package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface Typed<E extends Enum<E>> {

	E type();

}
