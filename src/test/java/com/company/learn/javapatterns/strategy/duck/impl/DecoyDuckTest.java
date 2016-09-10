package com.company.learn.javapatterns.strategy.duck.impl;

import com.company.learn.javapatterns.strategy.duck.api.DisplayableDuck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 Created on 10.09.16.
 */
public class DecoyDuckTest {

	private DisplayableDuck duck;

	@Before
	public void setUp() {
		duck = new DecoyDuck();
	}

	@Test
	public void shouldDisplayDecoyDuck() {
		duck.display();
	}
}