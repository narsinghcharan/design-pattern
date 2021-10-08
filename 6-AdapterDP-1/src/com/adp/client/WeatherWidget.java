package com.adp.client;

import com.adp.weather_adapter.WeatherAdapter;

public class WeatherWidget {

	public static void main(String[] args) {
		
		WeatherAdapter wa = new WeatherAdapter();
		
		int temp = wa.findTemparature(490001);
		
		System.out.println(temp);
	}
}
