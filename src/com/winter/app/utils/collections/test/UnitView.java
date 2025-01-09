package com.winter.app.utils.collections.test;

import java.util.ArrayList;

public class UnitView {
	
	
	public void view(ArrayList<? extends GroundUnit> ar) {
		//Ground 포함 Ground상속하는 클래스들
		System.out.println("extends");
	}
	
	public void view2(ArrayList<? super GroundUnit> ar) {
		//Ground 포함 Ground의 부모들
		System.out.println("super");
	}

}
