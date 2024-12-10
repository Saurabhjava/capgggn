package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private LocalDate dob;
	private Long phone;
	@Column(unique = true)
	private String email;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, LocalDate dob, Long phone, String email, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dob=" + dob + ", phone=" + phone + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
}
