package com.cg.bean;

import java.time.LocalDate;

public class Employee {
	private int eid;
	private String name;
	private LocalDate dob;
	private String email;
	private long phone;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, LocalDate dob, String email, long phone, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return eid+"\t"+name+"\t"+dob+"\t"+email+"\t"+salary+"\t"+phone;
	}
}
