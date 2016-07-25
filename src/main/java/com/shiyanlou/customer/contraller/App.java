package com.shiyanlou.customer.contraller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.customer.services.CustomerService;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-antotest.xml");
		
		CustomerService cust = (CustomerService)context.getBean("AAA");
		System.out.println(cust);
	}
}
