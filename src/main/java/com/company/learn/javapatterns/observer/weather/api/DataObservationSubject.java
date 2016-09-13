package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface DataObservationSubject<T> extends DataService<T>, ObservationSubject<T> {
	
}
