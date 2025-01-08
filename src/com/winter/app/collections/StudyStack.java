package com.winter.app.collections;

public class StudyStack {
	
	private int [] ar;
	
	public int pop() {
		//ar 배열의 0번 을 리턴하고
		int num = ar[0];
		//0번의 값을 삭제
		int [] copy = new int [ar.length-1];
		
		for(int i=0;i<copy.length;i++) {
			copy[i]=ar[i+1];
		}
		
		ar = copy;
		
		return num;
	}
	
	public void set(int num) {
		//ar 이 null이면 1칸 배열을 만들고 num을 대입
		
		//아니면 num값과 ar의 값들중 일치하는게 있으면 대입 X
		//일치하는게 없으면
		//ar의 배열에 하나 더 큰 배열을 생성하고
		//마지막에 num을 대입
		boolean flag=true;
		if(ar == null) {
			ar = new int [1];
			ar[0]=num;
		}else {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]==num) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				int [] copy = new int [ar.length+1];
				for(int i=0;i<ar.length;i++) {
					copy[i]=ar[i];
				}
				
				copy[ar.length]=num;
				
				ar = copy;
				
			}
			
			
			
		}
	}

	
	public void add(int num) {
		//ar 이 null이면 1칸 배열을 만들고 num을 대입
		if(ar == null) {
			ar=new int [1];
			ar[0]=num;
		}else {
			//ar이 null이 아니라면
			//ar의 배열에 하나 더 큰 배열을 생성하고
			int [] copy = new int [ar.length+1];
			//12, 34
			for(int i=0;i<ar.length;i++) {
				copy[i+1]=ar[i];
			}
			//num을 0번 index에 대입
			copy[0]=num;
			ar = copy;
		}
		
	}
	
	
	public void info() {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
