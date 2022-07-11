package com.cdac.Dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Adress;
import com.cdac.entity.Customer;


public class CustomerAdressDao {
	
	public void add(Customer cust) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
        em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
		
	}
	public void update(Customer cust) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
        em.merge(cust); //merge method will generate update query
		
		tx.commit();
		
		emf.close();
		
	}
	public  Customer fetch(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		//find method generates selects query where pk=?
	    Customer cust =em.find(Customer.class, id);
		// find is use to fetch data based on primary key only
		emf.close();
		
		return cust;
		}
	public List<Customer>fetchCustomerEmail(String domain){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select c from Customer c where c.email like :em");//HQL OR JPQL
		q.setParameter("em","%"+domain+"%");
		
		List<Customer>list=q.getResultList();
		
		emf.close();
	   return list;	
	}
	public List<Customer>fetchCustomerByCity(String city){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select c from Customer c join c.adress a where a.city =:ct");//HQL OR JPQL
		q.setParameter("ct",city);
		
		List<Customer>list=q.getResultList();
		
		emf.close();
	   return list;	
	}
	public Adress fetchAdressByCustomerName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select a from Customer c join c.adress a where c.name =:nm");//HQL OR JPQL
		q.setParameter("nm",name);
		
		Adress addr=(Adress)q.getSingleResult();
		
		emf.close();
	   return addr;	
	}
	
	public void add(Adress addr) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
        em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
		
	}
	public Adress fetchadress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		//find method generates selects query where pk=?
		Adress addr = em.find(Adress.class, id);
		// find is use to fetch data based on primary key only
		emf.close();
		return addr;
		
		
		}
	

	

}

