package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DisplayableObserver;
import com.company.learn.javapatterns.observer.weather.api.ObservableSubject;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

/**
 Created on 13.09.16.
 */
public class CurrentConditionsDisplay implements DisplayableObserver<WeatherData> {

	private final ObservableSubject<WeatherData> weatherSubject;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(final ObservableSubject<WeatherData> weatherSubject) {
		this.weatherSubject = weatherSubject;
		weatherSubject.registerObserver(this);
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
