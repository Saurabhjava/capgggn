package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;
import com.cg.config.JpaConfig;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class StudentDao implements IStudentDao{
	EntityManager em=JpaConfig.getEntityManager();
	EntityTransaction tx=em.getTransaction();
	@Override
	public void createStudent(Student s) {
		tx.begin();
		em.persist(s);
		tx.commit();
		em.clear();
	}

	@Override
	public Student getStudent(int sid) {
		Student s=em.find(Student.class, sid);
		return s;
	}

	@Override
	public List<Student> getAll() {
		Query q=em.createQuery("from Student s");
		List<Student> students=q.getResultList();
		return students;
	}

	@Override
	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

}
