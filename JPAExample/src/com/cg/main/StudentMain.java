package com.cg.main;

import java.time.LocalDate;

import com.cg.bean.Student;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDao;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {		
		IStudentService service=new StudentServiceImpl();
//		System.out.println(service.saveStudent(new Student(103,"Ankan", LocalDate.of(2002, 12, 12), 98)));
//		System.out.println(service.saveStudent(new Student(104,"Atul", LocalDate.of(2001, 12, 12), 98)));
//		System.out.println(service.saveStudent(new Student(105,"Aryan", LocalDate.of(2005, 12, 12), 98)));
		
		/*
		 * Student s=service.findStudent(103); if(s!=null) System.out.println(s); else
		 * System.out.println("Student Not Found");
		 */
		service.getAllStudent().forEach(s->System.out.println(s));
	}

}
