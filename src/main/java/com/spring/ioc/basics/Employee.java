package com.spring.ioc.basics;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String toString()
	{
		return "firstName " + firstName + " lastName " + lastName + " Address " + address;
	}
	

}
