package com.cg.repo;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeRepo {
	static List<Employee> li;
	static {
		li = new ArrayList<Employee>();

		li.add(new Employee(1001, "Shipra", 98000));
		li.add(new Employee(1002, "Amit", 88000));
		li.add(new Employee(1003, "Rahul", 48000));
		li.add(new Employee(1004, "Atul", 120000));

	}
	
	public static List<Employee> getEmployees(){
		return li;
	}
}
