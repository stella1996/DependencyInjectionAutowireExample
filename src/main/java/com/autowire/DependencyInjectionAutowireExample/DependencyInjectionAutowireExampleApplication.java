package com.autowire.DependencyInjectionAutowireExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionAutowireExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInjectionAutowireExampleApplication.class, args);
		
		Student s= context.getBean(Student.class);
		s.display();
	}
}
