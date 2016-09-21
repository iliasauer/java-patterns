package com.company.learn.javapatterns.factory.pizza.api;

/**
 Created on 21.09.16.
 */
public interface Stylized<E extends Enum<E>> {

	Enum<E> style();

}
