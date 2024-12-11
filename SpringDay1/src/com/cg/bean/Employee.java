package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String empid;
	private String name;
	private String email;
	@Autowired
	private Address address;

	public Employee() {
		this.empid = "101";
		this.name = "Ankan";
		this.email = "ankan@gmail.com";
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printEmployee() {
		System.out.println("EmployeeId: " + empid);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);

		System.out.println("=========Address========");
		System.out.println("City: " + address.getCity());
		System.out.println("Country: " + address.getCountry());
		System.out.println("Zip: " + address.getZip());

	}
}
