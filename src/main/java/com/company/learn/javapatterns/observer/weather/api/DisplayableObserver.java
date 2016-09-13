package com.company.learn.javapatterns.observer.weather.api;

import com.company.learn.javapatterns.common.Displayable;

/**
 Created on 13.09.16.
 */
public interface DisplayableObserver<T> extends Displayable, Observer<T> {
	
}
