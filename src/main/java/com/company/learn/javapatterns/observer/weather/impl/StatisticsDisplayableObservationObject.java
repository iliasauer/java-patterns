package com.company.learn.javapatterns.observer.weather.impl;

import com.company.learn.javapatterns.observer.weather.api.DisplayableObservationObject;
import com.company.learn.javapatterns.observer.weather.api.ObservationSubject;
import com.company.learn.javapatterns.observer.weather.api.WeatherData;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 Created on 13.09.16.
 */
public class StatisticsDisplayableObservationObject
	implements DisplayableObservationObject<WeatherData> {
	
	private List<Double> temperatures;

	public StatisticsDisplayableObservationObject(
		final ObservationSubject<WeatherData> weatherSubject
	) {
		weatherSubject.registerObservationObject(this);
		this.temperatures = new ArrayList<>();
	}

	@Override
	public void display() {
		final DoubleSummaryStatistics stats = temperatures
			.stream()
			.collect(Collectors.summarizingDouble(Double::doubleValue));
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
