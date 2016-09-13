package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface ObservableSubject<T> {

	void registerObserver(final Observer<T> observer);

	void removeObserver(final Observer<T> observer);

	void notifyObservers();

}
