package com.SpringBootJPA;

public class Person {

	String name;
	String Address;
	int age;
	
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Address=" + Address + ", age=" + age + "]";
	}
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		Address = address;
		this.age = age;
	}
	
}
