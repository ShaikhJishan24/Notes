package com.StereoTypeAnnotationBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="stud")
public class Student {
    
	@Value("101")
	private int id;
	
	@Value("Kavita")
	private String name;
	
	@Autowired  // this is for creating the object and automatically inject it
	private Address add;
	
	public Address getAdd() {
		return add;
	}
	
    // set method used to set value in Address add filed 
	public void setAdd(Address add) {
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
