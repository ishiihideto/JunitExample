package example3_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherForecastTest {
	WeatherForecast forecast = new WeatherForecast();

	/**
	テストケースNo1-1
	降水確率0未満を検証する。
	trueが帰ってくればテストOK
	**/
	@Test
	public void checkUmbrella_1_1() {
		boolean result = forecast.check(-1);
		assertTrue(result);
	}

	/**
	テストケースNo1-1
	降水確率100以上を検証する。
	trueが帰ってくればテストOK
	**/
	@Test
	public void checkUmbrella_1_2() {
		boolean result = forecast.check(101);
		assertTrue(result);
	}
}
