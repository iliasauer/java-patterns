package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface Observer<T> {

	void update(final T observableSubjectData);

}
