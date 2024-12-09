package com.cg.bean;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "stutable")
public class Student {	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq_gen")
	//@SequenceGenerator(name="my_seq_gen", sequenceName = "my_sequence", initialValue = 101, allocationSize = 5)
	private int sid;
	@Column(nullable = false)
	private String name;
	private LocalDate dob;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid,String name, LocalDate dob, int marks) {
		super();
		this.sid=sid;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + ", marks=" + marks + "]";
	}
}
