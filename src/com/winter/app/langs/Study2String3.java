package com.winter.app.langs;

public class Study2String3 {

	public static void main(String[] args) {
		String number = "010-1234-5678";
		
		//subString(idx):idx부터 끝 까지
		//문자열에서 일부분을 추출할 때 사용
		String n = number.substring(9);
		System.out.println(n);
		
		//subString(idx1, idx2):idx1부터 idx2미만 까지
		n=number.substring(4, 8);
		System.out.println(n);
		String name="win.ter.gif";
		int idx = name.lastIndexOf(".");
		name=name.substring(idx+1);
		System.out.println(name);
		
		name="990123-1234567";
		
		//name.charAt(name.indexOf("-")+1)
		name=name.substring(7, 8);
		if(name.equals("1") || name.equals("3")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		

	}

}
