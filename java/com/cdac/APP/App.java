package com.cdac.APP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Atm;
import com.cdac.component.Calculator;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;

public class App {
	
	public static void main(String[]args) {
		
		//loading Spring/IOC Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//Accessing a particular bean
		HelloWorld hw=(HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Aditya"));
		//but why are we using Spring to create object of helloworld class?
		//we could have created object on our own like this
		//HelloWorld hw=new HelloWorld
		
		Calculator c= (Calculator) ctx.getBean("calc");
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(50, 30));
		
		CurrencyConverter cc=  (CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD", "INR", 650));
		
		LoginService ls=(LoginService) ctx.getBean("loginserv");
		System.out.println(ls.isValidUser("Aditya","123"));
		
		Atm atm=(Atm)ctx.getBean("hdfcAtm-v2");
		atm.withdraw(101010, 5000);
		
		
	}

}
