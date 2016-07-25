package com.shiyanlou.demo.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Appconfig {
	
	@Bean(name="animal")
	public IAnimal getAnimal(){
		return new Dog();
	}
}
