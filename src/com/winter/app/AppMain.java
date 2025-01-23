package com.winter.app;

import com.winter.app.departments.DepartmentController;
import com.winter.app.departments.DepartmentDAO;
import com.winter.app.locations.LocationController;
import com.winter.app.locations.LocationDAO;
import com.winter.app.tests.DepartmentDAOTest;
import com.winter.app.utils.DBConnection;


public class AppMain {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		//객체 생성
		//클래스명 변수명 = new 생성자();
		FrontController controller = new FrontController();
		//멤버사용
		//참조변수명.멤버명
		controller.start();
		
		
		DepartmentDAOTest daoTest = new DepartmentDAOTest();
		try {
			daoTest.getNameTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
