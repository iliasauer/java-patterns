package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DataObservationSubject;
import com.company.learn.javapatterns.observer.weather.api.ObservationObject;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

import java.util.LinkedList;
import java.util.List;

/**
 Created on 13.09.16.
 */
public class BasicWeatherDataObservationSubject
	implements DataObservationSubject<WeatherData>, WeatherData {

	private boolean changed;
	private final List<ObservationObject<WeatherData>> observationObjects;
	private WeatherData weatherData;

	public BasicWeatherDataObservationSubject() {
		observationObjects = new LinkedList<>();
		weatherData = new BasicWeatherData();
	}

	@Override
	public void dataChanged() {
		setChanged();
		notifyObservationObjects();
	}

	@Override
	public void setData(final WeatherData weatherData) {
		this.weatherData = weatherData;
		dataChanged();
	}

	@Override
	public void registerObservationObject(final ObservationObject<WeatherData> observationObject) {
		observationObjects.add(observationObject);
	}

	@Override
	public void removeObservationObject(final ObservationObject<WeatherData> observationObject) {
		observationObjects.remove(observationObject);
	}

	@Override
	public void notifyObservationObjects() {
		if (!changed) {
			return;
		}
		observationObjects.forEach(observer -> observer.update(this));
		changed = false;
	}

	@Override
	public void setChanged() {
		changed = true;
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
