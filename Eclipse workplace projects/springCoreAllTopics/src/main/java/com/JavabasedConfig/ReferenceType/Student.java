package com.JavabasedConfig.ReferenceType;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
      
	@Autowired
    private Address add;
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [add=" + add + "]";
	}

	
}
