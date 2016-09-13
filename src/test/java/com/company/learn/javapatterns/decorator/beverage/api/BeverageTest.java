package com.company.learn.javapatterns.decorator.beverage.api;

import com.company.learn.javapatterns.decorator.beverage.impl.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by on 9/13/2016.
 */
public class BeverageTest {

    private List<Beverage> beverages;

    @Before
    public void setUp() throws Exception {
        beverages = Arrays.asList(
                new Espresso(),
                new Whip(new Mocha(new Mocha(
                        new DarkRoast()
                ))),
                new Whip(new Mocha(new Soy(
                        new HouseBlend()
                )))
        );
    }

    @Test
    public void shouldPrintBeverageInfo() throws Exception {
        beverages.forEach(beverage -> {
            System.out.println(Beverage.info(beverage));
        });
    }

}