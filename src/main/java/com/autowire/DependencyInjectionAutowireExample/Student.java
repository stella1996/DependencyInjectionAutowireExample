package com.autowire.DependencyInjectionAutowireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Integer Sid;
	private String Sname;
	@Autowired
	private Address address;
	public Integer getSid() {
		return Sid;
	}
	public void setSid(Integer sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	
    public void  display(){
    	System.out.println("Student Object Created");
    	address.display();
    }
}
