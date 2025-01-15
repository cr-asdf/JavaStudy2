package com.winter.app.employees;

import java.util.List;
import java.util.Scanner;

import com.winter.app.utils.DBConnection;

public class EmployeeController {
	
	private EmployeeService employeeService;
	private EmployeeView employeeView;
	
	
	public EmployeeController() {
		employeeService=new EmployeeService();
		employeeView = new EmployeeView();
	}
	public void start( )throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		while(check) {
			System.out.println("1. 사원 목록 출력");
			System.out.println("2. 부서 통계");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				List<EmployeeDTO> ar = employeeService.getList(sc);
				employeeView.view(ar);
			}else if (select==2) {
				employeeService.getInfo();
			}else {				
				break;
			}
		}
	}
}
