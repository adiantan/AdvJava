package com.cdac.comonent.atmandBank;

public interface Bank {
	
	public void withdraw(int atmId,int acno,double amount);

	public boolean isAccountPresent(int acno);

}
