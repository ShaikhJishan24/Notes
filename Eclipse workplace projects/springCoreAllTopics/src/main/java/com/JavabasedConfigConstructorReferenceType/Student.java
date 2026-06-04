package com.JavabasedConfigConstructorReferenceType;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    
	@Autowired
    private Address ad;

	public Student(Address ad) {
		super();
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Student [ad=" + ad + "]";
	}	
}
