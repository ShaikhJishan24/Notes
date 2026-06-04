package com.JavabasedConfigConstructorReferenceType;

public class Address {
      
	private String city, country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}	
}
