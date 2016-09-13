package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DisplayableObserver;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

import java.util.Observable;

/**
 Created on 13.09.16.
 */
public class CurrentConditionsDisplayableObserver implements DisplayableObserver<WeatherData> {

	private double temperature;
	private double humidity;

	public CurrentConditionsDisplayableObserver(final Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(
			"Current conditions: " + temperature + " degrees and " + humidity + "% humidity"
		);
	}

	@Override
	public void update(final Observable observable, final Object arg) {
		final WeatherData weatherData = mapToData(observable);
		temperature = weatherData.getTemperature();
		humidity = weatherData.getHumidity();
		display();
	}
}
