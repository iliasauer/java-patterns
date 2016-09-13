package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DisplayableObservationObject;
import com.company.learn.javapatterns.observer.weather.api.ObservationSubject;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

/**
 Created on 13.09.16.
 */
public class CurrentConditionsDisplayableObservationObject
	implements DisplayableObservationObject<WeatherData> {

	private double temperature;
	private double humidity;

	public CurrentConditionsDisplayableObservationObject(
		final ObservationSubject<WeatherData> weatherSubject
	) {
		weatherSubject.registerObservationObject(this);
	}

	@Override
	public void display() {
		System.out.println(
			"Current conditions: " + temperature + " degrees and " + humidity + "% humidity"
		);
	}

	@Override
	public void update(final WeatherData weatherData) {
		temperature = weatherData.getTemperature();
		humidity = weatherData.getHumidity();
		display();
	}
}
