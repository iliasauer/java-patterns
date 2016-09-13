package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.abstr.AbstractDataObservable;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

/**
 Created on 13.09.16.
 */
public class BasicWeatherDataObservable
	extends AbstractDataObservable<WeatherData> implements WeatherData {

	private WeatherData weatherData;

	@Override
	public void setData(final WeatherData weatherData) {
		this.weatherData = weatherData;
		dataChanged();
	}

	@Override
	public double getTemperature() {
		return weatherData.getTemperature();
	}

	@Override
	public double getHumidity() {
		return weatherData.getHumidity();
	}

	@Override
	public double getPressure() {
		return weatherData.getPressure();
	}
}
