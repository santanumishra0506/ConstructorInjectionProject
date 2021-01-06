package com.spring.ioc.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorInjectionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectionProjectApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Address workAddress = (Address)context.getBean("workAddress");
		System.out.println(workAddress);
		
		Employee randy = (Employee)context.getBean("randy");
		System.out.println(randy);
	}

}
