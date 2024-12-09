package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;

public interface IStudentDao {
	public void createStudent(Student s);
	public Student getStudent(int sid);
	public List<Student> getAll();
	public void deleteStudent(int sid);
	public void updateStudent(Student s);
}
