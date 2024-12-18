package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employees")
public class EmployeeAPI {
	@Autowired
	private IEmployeeService service;
	
	@GetMapping
	public List<Employee> getAll(){
		return service.getAllEmployee();
	}
	@GetMapping("/{eid}")
	public Employee getEmployeeById(@PathVariable int eid) throws EmployeeNotFoundException {
		return service.getEmployeeByID(eid);
	}
	@PostMapping
	public Employee create(@RequestBody @Valid Employee emp) {
		return service.createEmployee(emp);
	}
	
	@PutMapping
	public Employee updateEmmployee(@RequestBody Employee emp) throws EmployeeNotFoundException {
		service.updateEmployee(emp);
		return emp; 
	}
	@DeleteMapping("/{eid}")
	public String deleteEmployee(@PathVariable int eid) throws EmployeeNotFoundException {
		
		return service.removeEmployee(eid);
	}
}
