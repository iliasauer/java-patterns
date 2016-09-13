package com.company.learn.javapatterns.strategy.duck.api;

import com.company.learn.javapatterns.strategy.duck.impl.DecoyDuck;
import com.company.learn.javapatterns.strategy.duck.impl.MallardDuck;
import com.company.learn.javapatterns.strategy.duck.impl.RocketDuck;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Created on 13.09.16.
 */
public class DisplayableDuckTest {

	private List<DisplayableDuck> ducks;

	@Before
	public void setUp() {
		ducks = new ArrayList<>(
			Arrays.asList(
				new DecoyDuck(), new MallardDuck(), new RocketDuck()
			)
		);
	}

	@Test
	public void shouldDisplayDucks() throws Exception {
		ducks.forEach(DisplayableDuck::display);
	}
}