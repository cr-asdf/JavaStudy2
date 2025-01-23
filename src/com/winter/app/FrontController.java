package com.winter.app;

import java.util.Scanner;

import com.winter.app.departments.DepartmentController;
import com.winter.app.employees.EmployeeController;
import com.winter.app.locations.LocationController;

public class FrontController {
	
	private DepartmentController departmentController;
	private LocationController locationController;
	private EmployeeController employeeController;
	
	public FrontController() {
		departmentController = new DepartmentController();
		locationController = new LocationController();
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			try {
				System.out.println("1. 부서 관리");
				System.out.println("2. 지역 관리");
				System.out.println("3. 사원 관리");
				System.out.println("4. 종료");
				int select = sc.nextInt();
				if(select==1) {
					departmentController.start();
				}else if(select==2) {
					locationController.start();
								
				}else if(select==3) {
					employeeController.start();
					
					System.out.println("안녕히 가세요");
					break;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}//while 끝
		
		
	}//start 끝
	
	

}//class 끝
