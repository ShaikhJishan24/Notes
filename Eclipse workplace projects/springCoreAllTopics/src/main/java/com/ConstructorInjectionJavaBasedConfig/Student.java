package com.ConstructorInjectionJavaBasedConfig;

public class Student {
	
	private int id;
	private String name;
	private Address ad;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}

	public Student(int id, String name, Address ad) {
		this.id = id;
		this.name = name;
		this.ad = ad;
	}

}
