package com.shiyanlou.everytest;

public class Person {
	private String name;
	public  Person(){
		System.out.println("inside person");
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
}
