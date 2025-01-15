package com.winter.app.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentService {
	
	private DepartmentDAO departmentDAO=new DepartmentDAO();
	
	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}
	
	{
		departmentDAO = new DepartmentDAO();
	}
	
	public DepartmentService() {
		departmentDAO = new DepartmentDAO();
	}
	
	public DepartmentService(DepartmentDAO departmentDAO) {
		// TODO Auto-generated constructor stub
		this.departmentDAO=departmentDAO;
	}
	
	public List<DepartmentDTO> getList()throws Exception{
		 List<DepartmentDTO> ar = departmentDAO.getList();
		
		return ar;
	}
	
	
	public DepartmentDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 부서 번호 입력");
		DepartmentDTO departmentDTO = new DepartmentDTO();
		
		departmentDTO.setDepartment_id(sc.nextInt());
		
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		return departmentDTO;
		
	}

}
