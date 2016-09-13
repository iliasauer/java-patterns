package com.company.learn.javapatterns.observer.weather.api;

import com.company.learn.javapatterns.common.Displayable;

/**
 Created on 13.09.16.
 */
public interface DisplayableObservationObject<T> extends Displayable, ObservationObject<T> {
	
}
