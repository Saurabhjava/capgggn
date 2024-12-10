package com.cg.dao;

import java.util.List;

import com.cg.config.JpaConfig;
import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EmployeeDao {
	EntityManager em=JpaConfig.getEntityManager();
	
	public List<Employee> getAll(){
		TypedQuery<Employee> q=em.createQuery("from Employee e",Employee.class);
		List<Employee> emps=q.getResultList();
		return emps;
	}
	
	public List<Employee> getEmployeeByName(String name){
		TypedQuery<Employee> q=em.createQuery("from Employee e where e.name=:n",Employee.class);
		q.setParameter("n", name);
		List<Employee> emps=q.getResultList();
		return emps;
	}
	
	public List<Employee> getEmployeeByNameLike(String name){
		TypedQuery<Employee> q=em.createQuery("from Employee e where e.name like:n",Employee.class);
		q.setParameter("n", name+"%");
		List<Employee> emps=q.getResultList();
		return emps;
	}
	
	public List<Employee> getEmployeeByNameAndEmail(String name, String email){
		TypedQuery<Employee> q=em.createQuery("from Employee e where e.name=:n and e.email=:e",Employee.class);
		q.setParameter("n", name);
		q.setParameter("e", email);
		List<Employee> emps=q.getResultList();
		return emps;
	}
	
	public Employee getEmployeeWithMaxSal(){
		String query=" from Employee e where e.salary=(select max(e1.salary) from Employee e1)";
		TypedQuery<Employee> q=em.createQuery(query,Employee.class);
		
		return q.getSingleResult();
	}
}
