package com.shiyanlou.demo.helloworld;

public class HelloWorld {
	private String name;
	
	public void setName(String n){
		this.name = n;
	}
	
	public void printHello(){
		System.out.println("This first Spring 3:hello"+name);
	}
}
