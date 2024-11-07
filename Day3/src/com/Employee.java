package com;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String name;
	private LocalDate dob;
	private Gender gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, LocalDate dob, Gender gender) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return empid+"\t"+name+"\t"+dob+"\t"+gender ;
	}
	
	
}
