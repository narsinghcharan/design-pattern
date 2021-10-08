package com.adp.weather_adapter;

import com.adp.weather_app.IWeatherFinder;
import com.adp.weather_app.WeatherFinder;

public class WeatherAdapter {

	public int findTemparature(int zip) {
		
		//map this zip code to city name
		
		String city = null;
		
		//make some DB calls to get the city name based on zip code
		
		city = "bhilai";
		
		IWeatherFinder weather = new WeatherFinder();
		
		return weather.fine(city);
		
	}
}

/*
=> Adapter Design Pattern :-
	Adapter Pattern is about making two interfaces compatible, that are not compatible.
Adapter is also known as "Wrapper".
Adapter pattern helps you in converting interface of one class into another interface client expects.
	

*/