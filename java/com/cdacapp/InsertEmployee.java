package com.cdacapp;

import java.time.LocalDate;
import java.util.List;

//import java.time.LocalDate;



import com.cdac.Dao.EmployeeDao;
import com.cdac.entity.Employee;


public class InsertEmployee {

	public static void main(String[] args) {
		
	/*	Employee emp = new Employee();
		emp.setEmpno(1006);
		emp.setName("vishal");
		emp.setSalary(12000);
		emp.setDateOfJoining(LocalDate.of(2019, 10, 18));
		
		
	EmployeeDao dao = new EmployeeDao();
		
		dao.add(emp);*/
		
		/*EmployeeDao dao = new EmployeeDao();
		
		Employee emp =dao.fetch(1003);
		
		System.out.println(emp.getName()+" "+emp.getSalary());*/
		
		/*EmployeeDao dao = new EmployeeDao();
		
		List<Employee> list=dao.fetchall();
		
		for(Employee emp: list) {
			System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDateOfJoining());
		}
		*/
		
		/*EmployeeDao dao = new EmployeeDao();
		List<String> names=dao.fetchallnames();
		
		for(String name: names) {
			System.out.println(name);
		}
		
		EmployeeDao dao = new EmployeeDao();
		List<Object[]> namesandsalaries=dao.fetchallnamesandsalaries();
		
		for(Object[] arr:namesandsalaries) {
			System.out.println(arr[0]+" "+arr[1]);
		}
		
		*/
		EmployeeDao dao = new EmployeeDao();
		List<Employee>list2= dao.fetchallBySalary(15000);
		for(Employee emp:list2) {
			System.out.println(emp.getName()+" "+getSalary()+" "+getDateOfJoining());
		}
		
		
		//During this step, the persistence.xml file will be read
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(1002);
		emp.setName("Vipul");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2019, 10, 10));
		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();*/
	}

	private static String getDateOfJoining() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
