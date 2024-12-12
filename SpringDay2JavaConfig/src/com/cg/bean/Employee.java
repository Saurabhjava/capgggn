package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	@Value("${eid}")
	private int empid;
	@Value("${fname}")
	private String name;
	@Value("${email}")
	private String email;
	@Autowired
	private Address address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	
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
