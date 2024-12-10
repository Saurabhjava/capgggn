package com.cg.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

//		tx.begin();
//		Person p = new Person("Franklin", LocalDate.of(2001, 2, 22));
//		
//		DL obj = new DL(LocalDate.of(2020, 10, 11), LocalDate.of(2040, 10, 11), "NoidaRTO",p);
//		List<String> li = List.of("LMV", "HMV", "NT", "MCWG");
//		obj.setvType(li);		
//		p.setDl(obj);
//		
//	
//		em.persist(p);
//		tx.commit();
//		System.out.println("Person Created");
		
		Person obj=em.find(Person.class, 1);
		System.out.println(obj);
		System.out.println("=============DL Detail=========");
		System.out.println(obj.getDl());
	}

}
