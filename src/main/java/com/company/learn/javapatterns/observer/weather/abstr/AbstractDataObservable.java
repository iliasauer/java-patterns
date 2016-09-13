package com.company.learn.javapatterns.observer.weather.abstr;

import com.company.learn.javapatterns.observer.weather.api.DataService;

import java.util.Observable;

/**
 Created on 13.09.16.
 */
public abstract class AbstractDataObservable<T> extends Observable implements DataService<T> {

	@Override
	public void dataChanged() {
		setChanged();
		notifyObservers();
	}
}
