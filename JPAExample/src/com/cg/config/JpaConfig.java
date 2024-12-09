package com.cg.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaConfig {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		if(em==null || !em.isOpen()) {
			em=emf.createEntityManager();
		}
		return em;
	}

}
