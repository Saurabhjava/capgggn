package com.cg.service;

import java.util.List;

import com.cg.bean.Student;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDao;

public class StudentServiceImpl implements IStudentService {
	StudentDao dao=new StudentDao();
	@Override
	public String saveStudent(Student s) {
		if(s.getSid()==0 || s.getName()==null || s.getName().isBlank())
			return "Invalid Student Data";
		else {
			dao.createStudent(s);
			return "Student Created";
		}
	}

	@Override
	public Student findStudent(int sid) {
		// TODO Auto-generated method stub
		return dao.getStudent(sid);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public String updateStudent(Student s) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
