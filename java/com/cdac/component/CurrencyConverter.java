package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("currencyConv")//alternative to <bean id="currencyconv" class="com.cdac.component.Currencyconb "/>
public class CurrencyConverter {

	
	public double convert(String from ,String to, double amount ) {
		
		
		if(from.equals("USD")&&to.equals("INR"))
			return 78.98*amount;
		else if(from.equals("GBP")&&to.equals("INR"))
			return 98.41*amount;
		else
			return 0;//rather we should throw exception
		
	}
}
