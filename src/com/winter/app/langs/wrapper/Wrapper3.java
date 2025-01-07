package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin =sc.next();//971226-1234567
		
		// 9 7 1 2 2 6 - 1 2 3 4 5 6 7
		//*2 3 4 5 6 7   8 9 2 3 4 5  마지막번호는 검증용번호
		//18 + 21 + .........             총합계 구하기
		//122
		//11로 나눈 나머지값 구하기 ex) 0~10
		//11-나머지 결과값 구하기 
		//만약에 결과값이 두자리 수라면
		//결과값을 다시 10으로 나눈 나머지값을 구하기
		//나머지값을 검증용번호와 일치하는지 확인 1==7
		int count=2;
		int sum=0;
		for(int i=0;i<jumin.length()-1;i++) {
			if(count==10) {
				count=2;
			}
			if(i==6) {
				continue;
			}
//			String num = jumin.substring(i, i+1);
//			int n = Integer.parseInt(num);
//			if(num.equals("-")) {
//				continue;
//			}
			char ch=jumin.charAt(i);
			if(ch=='-') {
				continue;
			}
			int n =Integer.parseInt(String.valueOf(ch));
			sum=sum+n*count;
			
			count++;
			
		}
		
		sum=sum%11;
		
		sum=11-sum;
		
		if(sum>9) {
			sum = sum%10;
		}
		
		count=Integer.parseInt(jumin.substring(jumin.length()-1));
		count=Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));	  	
		if(sum == count) {
			System.out.println("정상");
		}else {
			System.out.println("주민센터 방문");
		}
		
		
		

	}

}
