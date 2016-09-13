package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.Observer;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;
import com.company.learn.javapatterns.observer.weather.api.WeatherDataService;

import java.util.LinkedList;
import java.util.List;

/**
 Created on 13.09.16.
 */
public class BasicWeatherDataService implements WeatherDataService {

	private final List<Observer<WeatherData>> observers;
	private WeatherData weatherData;

	public BasicWeatherDataService() {
		observers = new LinkedList<>();
		weatherData = new BasicWeatherData();
	}

	@Override
	public void weatherDataChanged() {
		notifyObservers();
	}

	@Override
	public void setWeatherData(final WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherDataChanged();
	}

	@Override
	public void registerObserver(final Observer<WeatherData> observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(final Observer<WeatherData> observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(this));
	}

	@Override
	public float getTemperature() {
		return weatherData.getTemperature();
	}

	@Override
	public float getHumidity() {
		return weatherData.getHumidity();
	}

	@Override
	public float getPressure() {
		return weatherData.getPressure();
	}
}
