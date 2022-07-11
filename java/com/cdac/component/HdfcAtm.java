package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm implements Atm{

		@Autowired
		private Bank bank;
		public void withdraw(int acno, double amount) {
			// TODO Auto-generated method stub
			
			System.out.println("customer at hdfc atm");
			bank.withdraw(12345, acno, amount);
		}
		
	

	}

