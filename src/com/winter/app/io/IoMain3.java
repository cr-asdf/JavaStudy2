package com.winter.app.io;

import java.io.File;

public class IoMain3 {
	
	public static void main(String[] args) {
		File file= new File("c:\\test", "Test.java");
		
		long size = file.length();
		System.out.println(size);
		
		file = new File("c:\\test");
		
		String [] list = file.list();
		
		//향상
		for(String s:list) {
			System.out.println(s);
			File file1 = new File(file, s);
			if(file1.isDirectory()) {
				System.out.println("폴더 ");
			}else if(file1.isFile()) {
				System.out.println("파일");
			}else {
				System.out.println("모름");
			}
			
			
		}
		
		//
		File [] files = file.listFiles();
		
		for(File f:files) {
			System.out.println(f.getName());
		}
		
		
		
	}

}
