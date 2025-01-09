package com.winter.app.utils.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {
	
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		Iterator<Integer> it = hashSet.iterator();
		
		System.out.println(it);
		System.out.println(it.getClass());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
