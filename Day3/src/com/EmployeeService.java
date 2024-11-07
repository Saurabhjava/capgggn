package com;

public class EmployeeService {
	public void printAllEmployee() {
		for(Employee e:EmployeeRepo.getEmployees()) {
			System.out.println(e);
		}
	}
	
	public Employee getEmployeeById(int eid) {
		for(Employee e:EmployeeRepo.getEmployees()) {
			if(e.getEmpid()==eid) 
				return e;					
		}
		return null;
	}
}
