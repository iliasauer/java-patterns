package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface DataService<T> {

	void dataChanged();

	void setData(final T data);

}
