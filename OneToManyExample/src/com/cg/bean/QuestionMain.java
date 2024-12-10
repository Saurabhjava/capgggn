package com.cg.bean;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class QuestionMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Question q = new Question("What is Hibernate?", "Saurabh", 2);
		Set<Answer> ans = new HashSet<Answer>();
		ans.add(new Answer("Hibernate is a ORM framework", "Ankan"));
		ans.add(new Answer("It is pwesistance provider", "Aman"));
		ans.add(new Answer("It created by Gevin King ", "Soumya"));
		q.setAnswers(ans);
		em.persist(q);
		tx.commit();

//		Question q=em.find(Question.class, 2);
//		System.out.println(q.getQname());
//		System.out.println("===Answer=====");
//		q.getAnswers().forEach(a->System.out.println(a.getAid()+"\t"+a.getAns()));

	}

}
