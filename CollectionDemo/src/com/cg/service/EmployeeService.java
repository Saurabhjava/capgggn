package com.cg.service;

import com.cg.bean.Employee;
import com.cg.repo.EmployeeRepo;

public class EmployeeService {
	public void printAllEmployee() {
		for(Employee emp:EmployeeRepo.getEmployees()) {
			System.out.println(emp);
		}
	}
	
	public void addEmployee(Employee emp) {
		
	}
	public void removeEmployee(Employee emp) {
		
	}
	public void printEmployeeById(int eid) {
		
	}
}
