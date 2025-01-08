package com.winter.app.collections;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyStack ss = new StudyStack();
		ss.set(1);
		ss.info();
		
		ss.set(2);
		ss.info();
		
		ss.set(1);
		ss.info();
		ss.set(5);
		ss.info();
	

	}

}
