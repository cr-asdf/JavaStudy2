package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호입력");
		String birth=sc.next();//041225-1234567
		//1. subString
		String year = birth.substring(0, 2);
		
		//2. 숫자로 변환
		int y = Integer.parseInt(year);
		
		System.out.println(y);
		
		//charAt, subString
		char ch = birth.charAt(7);
		
		if(ch=='1' || ch=='2') {
			y=1900+y;
			
		}else {
			y=2000+y;
		}
		
		System.out.println(2025-y);
		
		//월, 3-5 : 봄 6-8: 여름 9-11:가을 12 -2겨울
		String month = birth.substring(2, 4);
		int m = Integer.valueOf(month);
		if(m>2&&m<6) {
			System.out.println("봄");
		}else if(m>=6&&m<=8) {
			System.out.println("여름");
		}else if(m>=9&&m<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}

}
