package com.cg.main;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class ListDemo {
	
	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		es.printAllEmployee();
		
	}
}
