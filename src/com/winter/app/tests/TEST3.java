package com.winter.app.tests;

public class TEST3 {
	public class Ex13 {
		 public static void main(String[] args) {
		  int[] result = new int[5];
		  int[] arr = {77, 32, 10, 99, 50};
		  
		  for(int i=0; i<5; i++) {
		   result[i] = 1; // 현재값의 기본값을 1순위로
		   for(int j=0; j<5; j++) { // 현재값과 전체 배열값 각각을 비교하여 현재값보다 크면 있으면 순위값을 1 추가
		    if(arr[i] < arr[j]) { 
		     result[i]++;
		    }
		   }
		  }
		  
		  for(int k=0; k<5; k++) {
		   System.out.println(result[k]);
		  }
		 }
		}
}


