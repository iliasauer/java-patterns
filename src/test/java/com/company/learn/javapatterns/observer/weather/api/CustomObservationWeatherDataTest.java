package com.company.learn.javapatterns.observer.weather.api;

import com.company.learn.javapatterns.observer.weather.impl.BasicWeatherData;
import com.company.learn.javapatterns.observer.weather.impl.BasicWeatherDataObservationSubject;
import com.company.learn.javapatterns.observer.weather.impl.CurrentConditionsDisplayableObservationObject;
import com.company.learn.javapatterns.observer.weather.impl.StatisticsDisplayableObservationObject;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 Created on 13.09.16.
 */
public class CustomObservationWeatherDataTest {

	private DataObservationSubject<WeatherData> weatherDataService;
	private List<
		Function<ObservationSubject<WeatherData>, DisplayableObservationObject<WeatherData>>
		> observersCreators;
	private List<WeatherData> weatherDatum;

	@Before
	public void setUp() {
		weatherDataService = new BasicWeatherDataObservationSubject();
		observersCreators = Arrays.asList(
			CurrentConditionsDisplayableObservationObject::new,
			StatisticsDisplayableObservationObject::new
		);
		weatherDatum = Arrays.asList(
			new BasicWeatherData(80f, 65f, 30.4f),
			new BasicWeatherData(82f, 70f, 29.2f),
			new BasicWeatherData(78f, 90f, 29.2f)
		);
	}

	@Test
	public void shouldDisplayObserversOutput() throws Exception {
		observersCreators.forEach(observersCreator -> observersCreator.apply(weatherDataService));
		weatherDatum.forEach(weatherDataService::setData);
	}

}
