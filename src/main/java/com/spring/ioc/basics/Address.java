package com.spring.ioc.basics;

public class Address {

	private String street;
	private String city;
	private String state;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public String toString()
	{
		return "street " + street + " city " + city + " state " + state;
	}

	
	
}
