package com.winter.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput {
	
	

	
	public ArrayList<Weather> input() throws Exception {
		File file = new File("C:\\test\\sample.txt");
		file = new File("C:\\test", "sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<Weather> ar = new ArrayList<>();
		while(true) {
			String data = br.readLine();
			
			
			if(data==null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(data, "-");
			//list, set, map
			while(st.hasMoreTokens()) {
				String d=st.nextToken();
				//System.out.println(d);
				//Weather에 Data입력하고
				//Weather들을 모아서 리턴
				//main 메서드에 모든 내용을 출력
				Weather weather = new Weather();
				weather.setCity(d);
				d=st.nextToken();
				weather.setGion(Integer.parseInt(d));
				
				weather.setHuminity(Double.parseDouble(st.nextToken()));
				
				weather.setStatus(st.nextToken());
				
				ar.add(weather);
				
			}
			
		}
		
		br.close();
		fr.close();
		
		return ar;
	}

}
