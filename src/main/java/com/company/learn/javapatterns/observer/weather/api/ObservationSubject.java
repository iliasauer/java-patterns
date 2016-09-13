package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface ObservationSubject<T> {

	void registerObservationObject(final ObservationObject<T> observationObject);

	void removeObservationObject(final ObservationObject<T> observationObject);

	void notifyObservationObjects();

	void setChanged();

}
