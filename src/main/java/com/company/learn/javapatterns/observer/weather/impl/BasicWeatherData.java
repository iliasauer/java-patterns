package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.WeatherData;

/**
 Created on 13.09.16.
 */
public class BasicWeatherData implements WeatherData {

	private double temperature;
	private double humidity;
	private double pressure;

	public BasicWeatherData() {
	}

	public BasicWeatherData(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public double getTemperature() {
		return temperature;
	}

	@Override
	public double getHumidity() {
		return humidity;
	}

	@Override
	public double getPressure() {
		return pressure;
	}
}
