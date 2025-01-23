package com.winter.app.tests;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

public class DepartmentDAOTest {
	
		
	private DepartmentDAOTest departmentDAO;
	
	public DepartmentDAOTest() {
		departmentDAO = new DepartmentDAOTest();
		
	}
	
	public void getNameTest() throws Exception {
		DepartmentDTO departmentDTO =departmentDAO.getName();
		System.out.println(departmentDTO.getDepartment_name());
		
	}

	private DepartmentDTO getName() {
		// TODO Auto-generated method stub
		return null;
	}
}


