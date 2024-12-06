package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeDao {
	public List<Employee> getAll();
	public Employee findEmployee(int eid);
	public void createEmployee(Employee e);
	public void deleteEmployee(int eid);
	public void updateEmployee(Employee e);
}
