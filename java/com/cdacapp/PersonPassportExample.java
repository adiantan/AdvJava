package com.cdacapp;

import java.time.LocalDate;
import java.util.List;

import com.cdac.Dao.PersonPassportDao;
import com.cdac.entity.Person;

public class PersonPassportExample {
   
	public static void main(String[]args) {
		
		PersonPassportDao  dao= new PersonPassportDao();
		/*Person p = new Person();
		p.setName("Ashish");
		p.setEmail("Ashish@gmail");
		p.setDateOfBirth(LocalDate.of(1998 ,12,12));
		
		Passport ps= new Passport();
		ps.setIssueDate(LocalDate.of(2022,5,2));
		ps.setExpiryDate(LocalDate.of(2027,8,1));
		ps.setIssueBy("Govt.of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
		*/
		
		/*Person p=dao.fetchPassportNo(1);
		System.out.println(p.getName()+" "+p.getEmail());
		*/
		
		List<Person>list=dao.fetchPersonByPassportExpiryYear(2020);
		for(Person p:list)
		System.out.println(p.getName()+" "+p.getEmail());
	}

	
}
