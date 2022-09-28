package com.test.junit.lesson.junitlesson;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherForecastTest {
	WeatherForecast forecast = new WeatherForecast();

	/**
	テストケースNo1-1
	降水確率50％を検証する。
	trueが帰ってくればテストOK
	**/
	@Test
	public void checkUmbrella_1_1() {
		boolean result = forecast.check(50);
		assertTrue(result);
	}

	/**
	テストケースNo1-2
	降水確率39％を検証する。
	falesが帰ってくればテストOK
	**/
	@Test
	public void checkUmbrella_1_2() {
		boolean result = forecast.check(39);
		assertFalse(result);
	}

}