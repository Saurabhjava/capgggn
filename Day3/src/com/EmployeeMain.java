package com;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter Employee ID");
		 * int empid=sc.nextInt(); System.out.println("Enter Name"); String
		 * name=sc.next(); System.out.println("Enter DOB (yyyy-MM-dd)"); String
		 * dob=sc.next(); System.out.println("Enter Gender (male or female)"); String
		 * gender=sc.next();
		 * 
		 * Employee e=new Employee(empid, name, LocalDate.parse(dob),
		 * Gender.valueOf(gender.toUpperCase())); System.out.println(e);
		 */
		
		EmployeeService es=new EmployeeService();
		//es.printAllEmployee();
		Employee e=es.getEmployeeById(1030);
		if(e!=null)
			System.out.println(e);
		else
			System.out.println("Employee Not Found");
	}

}
