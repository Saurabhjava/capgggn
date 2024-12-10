package com.cg.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private LocalDate dob;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "mydl")
	private DL dl;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, LocalDate dob) {
		this.name = name;
		this.dob = dob;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public DL getDl() {
		return dl;
	}
	public void setDl(DL dl) {
		this.dl = dl;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", dob=" + dob + "]";
	}
}
