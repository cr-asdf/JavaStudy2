package com.winter.app.utils.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;
			boolean check = hashSet.add(num);
			if(!check) {
				i--;
			}
		}
		
		hashSet.clear();
		
		while(hashSet.size()<6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
		}
		
		System.out.println(hashSet);

	}

}
