package com.ReferenceType;

public class Address {
     
	private String city, street, country;

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", country=" + country + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
