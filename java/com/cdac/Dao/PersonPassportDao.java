package com.cdac.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Customer;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportDao {

	
	public void add(Person person) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
        em.persist(person); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
		
	}
	
	public Person fetchPassportNo(int passportNo){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p join p.passport ps where ps.passportNo=:pno");//HQL OR JPQL
		q.setParameter("pno",passportNo);
		Person p =(Person) q.getSingleResult();
	
		
		emf.close();
	   return p;	
	}
	public List<Person> fetchPersonByPassportExpiryYear(int year){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate)=:yr");//HQL OR JPQL
		q.setParameter("yr",year);
		List<Person>list= q.getResultList();
	
		
		emf.close();
	   return list;	
	}
	
	

	

}


