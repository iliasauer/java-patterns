package com.company.learn.javapatterns.observer.weather.api;

/**
 Created on 13.09.16.
 */
public interface WeatherDataService extends WeatherData, ObservableSubject<WeatherData> {

	void weatherDataChanged();

	void setWeatherData(final WeatherData weatherData);

}
