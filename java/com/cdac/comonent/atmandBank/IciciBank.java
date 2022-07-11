package com.cdac.comonent.atmandBank;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank{

	
public void withdraw(int atmId, int acno, double amount) {
		
		// TODO Auto-generated method stub
		
		System.out.println("customer of icici bank"); 
	}

	public boolean isAccountPresent(int acno) {
		// TODO Auto-generated method stub
		if(acno==202020)
			return true;
		return false;
	}
}
