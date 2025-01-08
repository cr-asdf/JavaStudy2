package com.winter.app.langs.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInfo {
	
	private StringBuffer info;
	
	public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("일산, -12, 0.56, 흐림,");
		this.info.append("인천* 32* 0.95* 무더위,");
		this.info.append("제주* 56* 0.02* 건조");
		
	}
	
	public ArrayList<WeatherDTO> init() {
		String data = this.info.toString().replace("*", ",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		//WeatherDTO [] weatherDTOs = new WeatherDTO[st.countTokens()/4];
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		//배열의 index번호로 사용
		int idx=0;
		
		while(st.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(st.nextToken().trim());
			weatherDTO.setGion(Integer.parseInt(st.nextToken().trim()));
			weatherDTO.setHumidity(Double.parseDouble(st.nextToken().trim()));
			weatherDTO.setStatus(st.nextToken().trim());
			//weatherDTOs[idx]=weatherDTO;
			ar.add(weatherDTO);
			//idx++;
		}
		
		return ar;
		
	}
	
	public WeatherDTO [] init_old() {
		//info의 정보를 파싱해서
		//WeatherDTO에 담아서
		//WeatherDTO들을 리턴
		
		//1. split
		//2. 구분자 통일
		String data = this.info.toString();
		data = data.replace("*", ",");
		
		String [] datas = data.split(",");//20
		
		WeatherDTO [] dtos = new WeatherDTO[datas.length/4];
		
		
		for(int i=0;i<datas.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			dtos[i/4]=weatherDTO;
			weatherDTO.setCity(datas[i].trim());
			weatherDTO.setGion(Integer.parseInt(datas[++i].trim()));
			weatherDTO.setHumidity(Double.parseDouble(datas[++i].trim()));
			weatherDTO.setStatus(datas[++i].trim());
		}
		
		return dtos;
		
	}
	
	public WeatherDTO findByName(ArrayList<WeatherDTO> ar, Scanner sc) {
		System.out.println("검색할 도시명 입력");
		String name = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getCity())) {
				return ar.get(i);
			}
		}
		
		return null;
	}
	
	public void add(ArrayList<WeatherDTO> ar, Scanner sc) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명 입력");
		
		weatherDTO.setCity(sc.next());
		
		System.out.println("기온 입력");
		weatherDTO.setGion(sc.nextInt());
		
		System.out.println("습도 입력");
		weatherDTO.setHumidity(sc.nextDouble());
		
		System.out.println("날씨 입력");
		weatherDTO.setStatus(sc.next());
		
		ar.add(weatherDTO);
		
	}
	
	public void delete(ArrayList<WeatherDTO> ar, Scanner sc) {
		System.out.println("도시명 입력");
		String name = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getCity())) {
				ar.remove(i);
				break;
			}
		}
		
	}
	
	

}
