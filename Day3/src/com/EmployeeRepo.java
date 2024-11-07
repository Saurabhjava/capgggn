package com;

import java.time.LocalDate;

public class EmployeeRepo {
	static Employee emp[];
	static {
		emp=new Employee[]{new Employee(101,"Mohit",LocalDate.of(1987,10,12),Gender.MALE),
				new Employee(102,"Suprita",LocalDate.of(2004,11,15),Gender.FEMALE),
				new Employee(103,"Aryan",LocalDate.of(2006,8,16),Gender.MALE),
				new Employee(104,"Frankline",LocalDate.of(2005,6,17),Gender.MALE),
				new Employee(105,"Shreemayee",LocalDate.of(2006,7,21),Gender.FEMALE)};
	}
	
	public static Employee[] getEmployees() {
		return emp;
	}
}
