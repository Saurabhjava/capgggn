package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.dao.IEmployeeRepo;
import com.cg.exception.EmployeeNotFoundException;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;
	
	
	public Employee createEmployee(Employee emp) {
		return repo.saveAndFlush(emp);
	}


	@Override
	public List<Employee> getAllEmployee() {		
		return repo.findAll();
	}


	@Override
	public Employee getEmployeeByID(int empid) throws EmployeeNotFoundException {
		Optional<Employee> op= repo.findById(empid); //12
		if(op.isPresent())
			return op.get();
		else
			throw new EmployeeNotFoundException("Employee with "+empid+" not Found");
		
		
	}


	@Override
	public List<Employee> getEmployeeByDepartment(String dept) {
		return repo.findByDepartment(dept);
	}


	@Override
	public String removeEmployee(int empid) throws EmployeeNotFoundException {
		Employee e=getEmployeeByID(empid);
		if(e!=null) {
			repo.delete(e);
			return "Employee Deleted";
		} else {
			return "Employee Not Found";
		}
		
	}


	@Override
	public void updateEmployee(Employee emp) throws EmployeeNotFoundException {
		Employee e=getEmployeeByID(emp.getEmpid());
		if(e!=null)
			repo.saveAndFlush(emp);
		
	}


	@Override
	public List<Employee> getEmployeeByNameLike(String name) {
		
		return repo.nameStartsWith(name);
	}
}
