package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.WeatherData;

/**
 Created on 13.09.16.
 */
public class BasicWeatherData implements WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;

	public BasicWeatherData() {
	}

	public BasicWeatherData(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public float getTemperature() {
		return temperature;
	}

	@Override
	public float getHumidity() {
		return humidity;
	}

	@Override
	public float getPressure() {
		return pressure;
	}
}
