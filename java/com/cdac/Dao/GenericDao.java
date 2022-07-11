package com.cdac.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {

	
	public void save(Object obj) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	try{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//merge is 2in 1 method
		//can be used for insert as well as update both we can use merge method
        em.merge(obj); 
		
		tx.commit();
	}
	finally {
		emf.close();
	}

}

	
	public Object fetchById(Class clazz,Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
		EntityManager em = emf.createEntityManager();
		
		//find method generates selects query where pk=?
		Object obj=em.find(clazz,pk);
		// find is use to fetch data based on primary key only
		return obj;
		}
		finally {
		emf.close();
		}
	}
 

public void delete(Class clazz,Object pk) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	try {
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	//find method generates selects query where pk=?
	Object obj=em.find(clazz,pk);
	// find is use to fetch data based on primary key only
	em.remove(obj);// remove will generate delete query
	
	tx.commit();
	
	}
	finally {
	emf.close();
	}
}
}
	

