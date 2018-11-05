package com.autowire.DependencyInjectionAutowireExample;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private Integer doorno;
	private String city;
	public void display(){
		System.out.println("Address object created");
	}

}
