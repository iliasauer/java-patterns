package com.company.learn.javapatterns.observer.weather.api;

import com.company.learn.javapatterns.common.Displayable;

import java.util.Observable;
import java.util.Observer;

/**
 Created on 13.09.16.
 */
public interface DisplayableObserver<T> extends Displayable, Observer {

	@SuppressWarnings("unchecked")
	default T mapToData(final Observable observable) {
		if (observable != null) {
			return (T) observable;
		}
		throw new IllegalStateException();
	}
	
}
