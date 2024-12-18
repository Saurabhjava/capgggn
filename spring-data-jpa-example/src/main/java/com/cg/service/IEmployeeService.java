package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	public Employee createEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeByID(int empid) throws EmployeeNotFoundException;
	public List<Employee> getEmployeeByDepartment(String dept);
	public String removeEmployee(int empid) throws EmployeeNotFoundException;
	public void updateEmployee(Employee emp) throws EmployeeNotFoundException;
	public List<Employee> getEmployeeByNameLike(String name);
}
