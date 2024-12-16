package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeService {
	public void createEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeByID(int empid);
	public List<Employee> getEmployeeByDepartment(String dept);
	public void removeEmployee(int empid);
	public void updateEmployee(Employee emp);
	public List<Employee> getEmployeeByNameLike(String name);
}
