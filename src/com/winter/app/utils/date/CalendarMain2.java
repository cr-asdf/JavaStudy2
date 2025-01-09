package com.winter.app.utils.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca1 = Calendar.getInstance();
		
		Calendar ca2 = Calendar.getInstance();
		
		ca2.set(Calendar.YEAR, 2100);
		
		ca1.set(2025, 0, 9, 12, 10);
		
		ca2.set(2025, 0, 9, 13, 5);
		
		System.out.println(ca1.getTime());
		System.out.println(ca2.getTime());
		
		int c1 = ca1.get(Calendar.MINUTE);
		int c2 = ca2.get(Calendar.MINUTE);
		
		System.out.println(c2-c1);
		
		long l1 = ca1.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		System.out.println(l1);
		System.out.println(l2);
		long r = l2-l1;
		System.out.println(r);
		System.out.println(r/1000+"초");
		System.out.println(r/(1000*60)+"분");
		
		ca1 = Calendar.getInstance();
		ca2 = Calendar.getInstance();
		
		System.out.println((long)1000*60*60*24*365);
		
		

	}

}
