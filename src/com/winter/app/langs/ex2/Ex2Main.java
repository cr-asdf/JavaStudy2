package com.winter.app.langs.ex2;

public class Ex2Main {

	public static void main(String[] args) {
//		WeatherInfo wInfo = new WeatherInfo();
//		WeatherView view = new WeatherView();
//		WeatherDTO [] dtos=wInfo.init();
//		
//		view.view(dtos);
		
		WeatherController wc = new WeatherController();
		wc.start();
		

	}

}
