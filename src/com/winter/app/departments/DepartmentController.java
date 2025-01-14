package com.winter.app.departments;

import java.util.Scanner;

public class DepartmentController {
	
	private DepartmentDAO departmentDAO;
	private DepartmentView departmentView;
	
	public DepartmentController() {
		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
	}
	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		while(check) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 상세 정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			if(select==1) {
				departmentDAO.getList();
			}else if(select==2) {
				DepartmentDTO departmentDTO = departmentDAO.getDetail();
				
				if(departmentDTO != null) {
					departmentView.view(departmentDTO);
				}else {
					departmentView.view("없는 부서입니다");
				}
				
				
			}else {
				break;
			}
			
		}
		
		
	}

}
