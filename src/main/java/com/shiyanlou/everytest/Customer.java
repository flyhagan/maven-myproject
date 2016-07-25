package com.shiyanlou.everytest;

public class Customer {
	private Person person;
	
	public  void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public void getPersonName() {
		System.out.println("name: " + this.person.getName());
	}
}
