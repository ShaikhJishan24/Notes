package com.ReferenceType;

public class Employee {
    
	private int id;
	private String name;
	
	// Reference type example
	private Address add;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
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
	public Address getAdd() {
		return add;
	}
	
	public void setAdd(Address add) {
		this.add = add;
	}
}
