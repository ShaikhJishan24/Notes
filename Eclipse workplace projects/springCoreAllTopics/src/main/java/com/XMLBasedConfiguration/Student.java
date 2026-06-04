package com.XMLBasedConfiguration;

public class Student {
        
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(){	
		System.out.println("in a student class");
	}
	public void display() {
		System.out.println("Name : " + name);
	}

}
