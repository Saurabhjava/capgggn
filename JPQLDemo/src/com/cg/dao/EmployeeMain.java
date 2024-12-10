package com.cg.dao;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		//dao.getEmployeeByNameAndEmail("Saurabh","sas@gmail.com").forEach(e->System.out.println(e));
		System.out.println(dao.getEmployeeWithMaxSal());
	}

}
