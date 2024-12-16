package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.dao.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;
	
	
	public void createEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		System.out.println("Employee Created....");
	}


	@Override
	public List<Employee> getAllEmployee() {		
		return repo.findAll();
	}


	@Override
	public Employee getEmployeeByID(int empid) {
		Optional<Employee> op= repo.findById(empid); //12
		if(op.isPresent())
			return op.get();
		else
			return null;
		
		//return repo.getById(empid);
	}


	@Override
	public List<Employee> getEmployeeByDepartment(String dept) {
		return repo.findByDepartment(dept);
	}


	@Override
	public void removeEmployee(int empid) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		System.out.println("Employee Updated.....");
		
	}


	@Override
	public List<Employee> getEmployeeByNameLike(String name) {
		
		return repo.nameStartsWith(name);
	}
}
