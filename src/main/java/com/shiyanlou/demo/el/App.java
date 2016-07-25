package com.shiyanlou.demo.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyanlou.demo.el.Customer;

public class App {
	private static ApplicationContext context;
	public static void main(String [] args){
		context = new ClassPathXmlApplicationContext("Spring-antoscan.xml");
		
		Customer obj = (Customer) context.getBean("customerBean");
		System.out.println(obj.toString());
	}
}
