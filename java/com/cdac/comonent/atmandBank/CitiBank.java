package com.cdac.comonent.atmandBank;

import org.springframework.stereotype.Component;

@Component("citiank-v2")
public class CitiBank implements Bank  {

	public void withdraw(int atmId, int acno, double amount) {
		
		// TODO Auto-generated method stub
		
		System.out.println("customer of citi bank"); 
	}

	public boolean isAccountPresent(int acno) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			if(acno==101010)
				return true;
			return false;
		
	
	}

}
