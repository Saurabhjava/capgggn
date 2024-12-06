package com.cg.main;

import java.time.LocalDate;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeDao edao=new EmployeeDao();
		//edao.getAll().forEach(e->System.out.println(e));
		
		edao.createEmployee(new Employee(109, "Hema", LocalDate.of(2002, 8, 15), "hema@gmail.com", 9810019810L, 18700));

	}

}
