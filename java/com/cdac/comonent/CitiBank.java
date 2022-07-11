package com.cdac.comonent;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank  {

	public void withdraw(int atmId, int acno, double amount) {
		
		// TODO Auto-generated method stub
		
		System.out.println("customer of citi bank"); 
	}

	

}
