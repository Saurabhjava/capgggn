package com.cg.service;

import java.util.List;

import com.cg.bean.Student;

public interface IStudentService {
	public String saveStudent(Student s);
	public Student findStudent(int sid);
	public List<Student> getAllStudent();
	public String updateStudent(Student s);
	public String deleteStudent(int sid);
}
