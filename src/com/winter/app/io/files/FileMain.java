package com.winter.app.io.files;

import java.util.List;

public class FileMain {

	public static void main(String[] args) {
		FileOutput fileOutput = new FileOutput();
//		fileOutput.write();
		
		fileOutput.add();
		
		FileInput fileInput = new FileInput();
		try {
			List<Weather> ar = fileInput.input();
			for(Weather weather:ar) {
				weather.info();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
