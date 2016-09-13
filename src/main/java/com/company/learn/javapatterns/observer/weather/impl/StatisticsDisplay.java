package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DisplayableObserver;
import com.company.learn.javapatterns.observer.weather.api.ObservableSubject;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 Created on 13.09.16.
 */
public class StatisticsDisplay implements DisplayableObserver<WeatherData> {
	
	private final ObservableSubject<WeatherData> weatherSubject;
	private List<Float> temperatures;

	public StatisticsDisplay(final ObservableSubject<WeatherData> weatherSubject) {
		this.weatherSubject = weatherSubject;
		weatherSubject.registerObserver(this);
		this.temperatures = new ArrayList<>();
	}

	@Override
	public void display() {
		final DoubleSummaryStatistics stats = temperatures
			.stream()
			.mapToDouble(Double::valueOf)
			.summaryStatistics();
		System.out.println(
			"Avg/Max/Min temperature: " + stats.getAverage() +
				"/" + stats.getMax() + "/" + stats.getMin()
		);
	}

	@Override
	public void update(final WeatherData weatherData) {
		temperatures.add(weatherData.getTemperature());
		display();
	}
}
