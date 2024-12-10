package com.cg.bean;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
//		Employee emp=new Employee("Shipra", "Shipra@gmail.com", 96000);
//		emp.setAddress(new Address("Delhi", "India", 110070));
//		em.persist(emp);
//		tx.commit();
//		System.out.println("Employee Saved");
		
		Employee e=em.find(Employee.class, 2);
		System.out.println(e.getEmpid()+"\t"+e.getName()+"\t"+e.getSalary());
		//em.detach(e);
		System.out.println("Address Details======");
		System.out.println(e.getAddress());
		em.remove(e);
		tx.commit();
		
	}
}
