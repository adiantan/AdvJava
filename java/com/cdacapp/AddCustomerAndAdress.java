package com.cdacapp;

import java.util.List;

import com.cdac.Dao.CustomerAdressDao;
import com.cdac.entity.Adress;
import com.cdac.entity.Customer;

public class AddCustomerAndAdress {

	
public static void main(String[]args) {
	CustomerAdressDao dao = new CustomerAdressDao();
	
	/*Customer c= new Customer();
	c.setName("amar");
	c.setEmail("amar@gmail.com");
	dao.add(c);
	
	Adress a= new Adress();
	a.setCity("pune");
	a.setState("Maharashtra");
	a.setPincode(40001);
	dao.add(a);
	*/
	
	/*Customer c=dao.fetch(1);
	Adress a=dao.fetchadress(1);
	c.setAdress(a);
	dao.update(c);*/
	
	/*Customer c= new Customer();
	c.setName("amruta");
	c.setEmail("amruta@outlook.com");
	
	
	Adress a= new Adress();
	a.setCity("nanded");
	a.setState("Maharashtra");
	a.setPincode(413552);
	
	c.setAdress(a);
	dao.add(c);*/
	
	/*List<Customer> list=dao.fetchCustomerEmail("outlook");
	for(Customer c:list) {
		System.out.println(c.getName()+" "+c.getEmail()+" "+c.getId());
	}*/
	
	/*List<Customer>list=dao.fetchCustomerByCity("pune");
	for(Customer c:list)
		System.out.println(c.getName()+" "+c.getEmail()+" "+c.getId());
	*/
	
	Adress a= dao.fetchAdressByCustomerName("amruta");
	System.out.println(a.getId()+" "+a.getCity()+" "+a.getPincode()+" "+a.getState());
	

}


	
}

