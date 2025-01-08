package com.winter.app.langs.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	private Scanner sc;
	
	public WeatherController() {
		this.weatherInfo=new WeatherInfo();
		this.weatherView=new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	public void start() {
		boolean check=true;
		//WeatherDTO [] dtos=null;
		ArrayList<WeatherDTO> ar=null;
		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 날씨정보출력");
			System.out.println("3. 날씨정보검색");
			System.out.println("4. 날씨정보추가");
			System.out.println("5. 날씨정보삭제");
			System.out.println("6. 프로그램종료");
			int select = this.sc.nextInt();
			if(select==1) {
				ar= weatherInfo.init();
			}else if(select==2) {
				weatherView.view(ar);
			}else if(select==3) {
				WeatherDTO weatherDTO = weatherInfo.findByName(ar, sc);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					weatherView.view("검색 결과가 없다");
				}
				
			}else if(select==4) {
				
			}else if(select==5) {
				
			}else {
				System.out.println("프로그램이 종료 됩니다");
				break;
			}
			
		}
		
		
	}

}
