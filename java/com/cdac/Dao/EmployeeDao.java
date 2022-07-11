package com.cdac.Dao;

import java.util.EventObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.cdac.entity.Employee;


public class EmployeeDao {
	
	public void add(Employee emp) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
        em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
		
	}
	

	public Employee fetch(int empno) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		//find method generates selects query where pk=?
		Employee emp=em.find(Employee.class, empno);
		// find is use to fetch data based on primary key only
		emf.close();
		
		return emp;
		}
	
	public List<Employee>fetchall(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e");//HQL OR JPQL
		
		List<Employee>list=q.getResultList();
		
		emf.close();
	   return list;	
	}
	
	public List<Employee>fetchallBySalary(double salary){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e where e.salary<=:sal");//HQL OR JPQL
		q.setParameter("sal",salary);
		
		List<Employee>list=q.getResultList();
		
		emf.close();
	   return list;	
	}
	
	public List<String> fetchallnames(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e.name from Employee e");
		List<String>names=q.getResultList();
		
		emf.close();
		   return names;	
		
	}
	
	public List<Object[]> fetchallnamesandsalaries(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e.name ,e.salary from Employee e");
		List<Object[]>list=q.getResultList();
		
		emf.close();
		   return list;	
		
	}

	

}
