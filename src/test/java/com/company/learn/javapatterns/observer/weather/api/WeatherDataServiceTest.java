package com.company.learn.javapatterns.observer.weather.api;

import com.company.learn.javapatterns.observer.weather.impl.BasicWeatherData;
import com.company.learn.javapatterns.observer.weather.impl.BasicWeatherDataService;
import com.company.learn.javapatterns.observer.weather.impl.CurrentConditionsDisplay;
import com.company.learn.javapatterns.observer.weather.impl.StatisticsDisplay;
import org.junit.Before;
import org.junit.Test;

/**
 Created on 13.09.16.
 */
public class WeatherDataServiceTest {

	private WeatherDataService weatherDataService;

	@Before
	public void setUp() {
		weatherDataService = new BasicWeatherDataService();
	}

	@Test
	public void shouldDisplayObserversOutput() throws Exception {
		new CurrentConditionsDisplay(weatherDataService);
		new StatisticsDisplay(weatherDataService);
		weatherDataService.setWeatherData(new BasicWeatherData(80f, 65f, 30.4f));
		weatherDataService.setWeatherData(new BasicWeatherData(82f, 70f, 29.2f));
		weatherDataService.setWeatherData(new BasicWeatherData(78f, 90f, 29.2f));
	}
}