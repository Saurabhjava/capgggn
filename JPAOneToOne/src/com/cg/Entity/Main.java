package com.cg.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		/*
		 * tx.begin(); DL obj=new DL("ab10xy24", LocalDate.of(2020, 10, 11),
		 * LocalDate.of(2040, 10, 11)); List<String>
		 * li=List.of("LMV","HMV","NT","MCWG"); obj.setvType(li); em.persist(obj);
		 * tx.commit();
		 */		
		
		/*
		 * DL d=em.find(DL.class, "ab10xy24"); System.out.println(d);
		 */
		tx.begin();
		DL d=em.find(DL.class, "ab10xy23");
		Person p=new Person("Franklin", LocalDate.of(2001, 2, 22));
		p.setDl(d);
		em.persist(p);
		tx.commit();
		System.out.println("Person Created");
	}

}
