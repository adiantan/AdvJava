package com.cdac.comonent.atmandBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm-v2")
public class HdfcAtm implements Atm{

		@Autowired
		private List<Bank>banks;
		public void withdraw(int acno, double amount) {
			// TODO Auto-generated method stub
			
			System.out.println("customer at hdfc atm");
			Bank currentBank=null;
			for(Bank bank:banks){
				if(bank.isAccountPresent(acno)) {
					
					currentBank=bank;
					break;
				}
			}
			currentBank.withdraw(12345, acno, amount);
		}
		
	

	}

